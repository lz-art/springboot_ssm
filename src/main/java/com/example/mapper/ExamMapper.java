package com.example.mapper;



import com.example.dto.ExamDTO;
import com.example.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

//@Mapper
@Repository
public interface ExamMapper {

public List<Users> selectAll();
}
