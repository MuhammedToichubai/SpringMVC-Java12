package peaksoft.service;

import peaksoft.entiity.Student;

import java.util.List;

/**
 * @author Mukhammed Asantegin
 */
public interface StudentService {
    List<Student> findAll();

    void save(Student student);
}
