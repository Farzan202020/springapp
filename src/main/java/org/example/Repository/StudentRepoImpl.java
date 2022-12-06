package org.example.Repository;

import org.example.Model.Student;

public interface StudentRepoImpl {
    void insertstudent(Student student);
    Boolean deletestudent(int id);
}
