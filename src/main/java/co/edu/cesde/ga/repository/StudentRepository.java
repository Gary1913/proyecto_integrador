package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.Student;

import java.util.List;

public interface StudentRepository {



                Student create(Student student);

                List<Student> findAll();

                Student findById(long studentId);

    Student findById(Long studentId);

    Student findByDocumentNumber(String documentNumber);

                boolean update(Student updatedstudent);

                boolean delete(long studentId);

                boolean existByDocumentNumber(String documentNumber);

    boolean delete(Long studentId);

    boolean existsByDocumentNumber(String documentNumber);

    int count();
            }


