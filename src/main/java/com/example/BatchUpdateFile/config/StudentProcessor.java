package com.example.BatchUpdateFile.config;

import com.example.BatchUpdateFile.model.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student student) throws Exception {
        // implement logic or validate in there in process
        return student;
    }
}
