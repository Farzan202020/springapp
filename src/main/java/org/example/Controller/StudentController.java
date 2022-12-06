package org.example.Controller;

import org.example.Model.Student;
import org.example.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;
    @RequestMapping("/insertstudent")
    @ResponseBody
    void insertstudent(@RequestBody Student student){
        studentService.insertstudent(student);

    }
    @RequestMapping("/deletestudent")
    @ResponseBody

    Boolean deletestudent(@RequestParam int id ){
        return deletestudent(id);


    }

}
