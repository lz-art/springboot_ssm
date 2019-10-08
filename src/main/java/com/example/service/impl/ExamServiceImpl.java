package com.example.service.impl;



import com.example.dto.ExamDTO;
import com.example.mapper.ExamMapper;
import com.example.pojo.Users;
import com.example.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {
   @Autowired(required = false)
   ExamMapper examMapper;
    public List<Users> selectAll() {
        System.out.println(examMapper.selectAll());
        return examMapper.selectAll();
    }

   /* public static void main(String[] args) {
        ExamServiceImpl examService = new ExamServiceImpl();
        examService.selectAll();
    }*/

}
