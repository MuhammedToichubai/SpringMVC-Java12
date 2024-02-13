package peaksoft.repo;

import peaksoft.entiity.Student;

import java.util.List;

/**
 * @author Mukhammed Asantegin
 */
public interface StudentRepo {
    List<Student> findAll();

    void save(Student student);
}
