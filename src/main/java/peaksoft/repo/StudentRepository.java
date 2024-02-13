package peaksoft.repo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import peaksoft.entiity.Student;

import java.util.List;

/**
 * @author Mukhammed Asantegin
 */

@Repository
@RequiredArgsConstructor
@Transactional
public class StudentRepository implements StudentRepo {

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public List<Student> findAll() {
        return entityManager
                .createQuery("select s from Student s", Student.class)
                .getResultList();
    }

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }
}
