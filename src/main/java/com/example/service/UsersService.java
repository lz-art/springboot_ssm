package com.example.service;

import com.example.pojo.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UsersService {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);


    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    /**
     * 显示列表内容
     * @return
     */
    @Select("select * from users")
    List<Users> selectList();

    /**
     * 根据用户主键id查询
     */
    Users selectByPrimaryKey(Integer id);


}
