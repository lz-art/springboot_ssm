package com.example.demo;


import com.example.dto.ExamDTO;
import com.example.pojo.QuestionInfo;
import com.example.pojo.Users;
import com.example.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class ExamController {
    @Autowired
    ExamService examService;


    @RequestMapping("xx")
    public Object selectAll(){
        List<Users> users = examService.selectAll();
        return users;
    }
}
