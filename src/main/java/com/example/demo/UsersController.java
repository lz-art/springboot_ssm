package com.example.demo;

import com.example.pojo.Users;
import com.example.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("users")
public class UsersController {
    @Autowired
    UsersService usersService;

    /**
     * 根据id进行查询__好烦躁
     */
    @RequestMapping("{id}")
    @ResponseBody
    public Users selectById(@PathVariable("id")final Integer id){
        return usersService.selectByPrimaryKey(id);
    }
    /**
     * 查询用户所有列表信息
     */
    @RequestMapping(value="list") // users/list
    @ResponseBody
    public ModelAndView selectList() {
        ModelAndView modelAndView = new ModelAndView();
        List<Users> list = usersService.selectList();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("manager/users/list");
        return modelAndView;
    }
/**
 * 添加功能
 */
@RequestMapping(value="add") //list页面点击会进入这里,从这里再返回到添加页面
    public String add(){
    return "manager/users/add";

}
//添加页面  进入这里,执行添加方法,并返回到list页面
@RequestMapping(value="addTo")  //  user/addTo
    public ModelAndView addTo(Users users){
    int i = usersService.insertSelective(users);
    return  selectList();
}
/**
 * 查看详情
 */
@RequestMapping("view/{id}")  // restful风格  users/view/id
public String view(@PathVariable("id")Integer id, Map<String,Object>map){
    Users users = usersService.selectByPrimaryKey(id);
    map.put("users",users);
   return "manager/users/view";
}
/**
 * 执行修改功能
 * 1.跳转到 修改页面
 *  先查询 后修改
 *  所以修改页面一开始是有值的,因为先执行了一波查询操作
 *
 */
@RequestMapping("update")  //  users/update?id=1
public ModelAndView update(@RequestParam("id")Integer id){
  ModelAndView modelAndView = new ModelAndView();
    Users users = usersService.selectByPrimaryKey(id);
    modelAndView.addObject("users",users);
    modelAndView.setViewName("manager/users/edit");
    return modelAndView;
}
//2.完成修改操作,跳转到列表上去
    @RequestMapping("updateTo")
    public ModelAndView updateTo(Users users){
        int i = usersService.updateByPrimaryKeySelective(users);
        return  selectList();
    }
/**
 * 根据id进行删除
 */
    @ResponseBody
    @RequestMapping("del")
    public int deleteById(@RequestParam("id")Integer id){
        int num = usersService.deleteByPrimaryKey(id);
        return num;
    }

}
