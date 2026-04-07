package co.edu.cesde.ga.service.impl;

import co.edu.cesde.ga.model.Student;
import co.edu.cesde.ga.repository.StudentRepository;
import co.edu.cesde.ga.service.StudentService;

import java.util.List;

import static co.edu.cesde.ga.repository.StudentRepository.existByDocumentNumber;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {

        if (isInvalidStudent(student)
                || existByDocumentNumber(student.getDocumentNumber())) {
            return null;
        }

        return studentRepository.create(student);
    }

    @Override
    public  boolean update(Student studentUpDate) {
        if (existByDocumentNumber(studentUpDate.getDocumentNumber())){
            return false;
        }
        if (isInvalidStudent(studentUpDate)
        || studentUpDate.getStudentId() == null
        || studentUpDate.getStudentId() <= 0L){
            return false;
        }
        return studentRepository.update(studentUpDate);

    }


    @Override
    public boolean delete   (Long studentId) {
        if (studentId == null || studentId <= 0L) {
            return false;
        }

        return studentRepository.delete(studentId);

    }

    @Override
    public Student findById(Long studentId) {
        if (studentId == null || studentId <= 0L) {
            return null;
        }
        return studentRepository.findById(studentId);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }




    public boolean isInvalidStudent(Student student) {
        return student == null
                || isBlank(student.getDocumentNumber())
                || isBlank(student.getFirstName())
                || isBlank(student.getLastName())
                || isBlank(student.getBirthDate())
                || student.getStatus() == null;
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isBlank();
    }
}




