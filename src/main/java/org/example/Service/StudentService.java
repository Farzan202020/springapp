package org.example.Service;

import org.example.Model.Student;
import org.example.Repository.StudentRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentServiceImpl {
    @Autowired
    private StudentRepoImpl studentRepo;
    @Override
    public void insertstudent(Student student) {
        studentRepo.insertstudent(student);


    }

    @Override
    public Boolean deletestudent(int id) {
        return studentRepo.deletestudent(id);

    }
}
