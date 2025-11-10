package com.lephantrunghieu.lpth_lesson01_spring_boot.controller;
import com.lephantrunghieu.lpth_lesson01_spring_boot.entity.lpthStudent;
import com.lephantrunghieu.lpth_lesson01_spring_boot.service.lpthStudentService;
import
        org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class lpthStudentController {
    @Autowired
    private lpthStudentService studentService;
    @GetMapping("/student-list")
    public List<lpthStudent> getAllStudents() {
        return studentService.getStudent();
    }
    @GetMapping("/student/{id}")
    public lpthStudent getAllStudents(@PathVariable String id)
    {
        Long param = Long.parseLong(id);
        return studentService.getStudent(param);
    }
    @PostMapping("/student-add")
    public lpthStudent addStudent(@RequestBody lpthStudent student)
    {
        return studentService.addStudent(student);
    }
    @PutMapping("/student/{id}")
    public lpthStudent updateStudent(@PathVariable String id,
                                     @RequestBody lpthStudent student) {
        Long param = Long.parseLong(id);
        return studentService.updateStudent(param,
                student);
    }
    @DeleteMapping("/student/{id}")
    public boolean deleteStudent(@PathVariable String id) {
        Long param = Long.parseLong(id);
        return studentService.deleteStudent(param);
    }
}
