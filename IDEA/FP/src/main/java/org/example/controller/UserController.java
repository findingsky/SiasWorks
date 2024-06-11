package org.example.controller;

import org.example.itf.UserMapper;
import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{

    @Autowired
    private UserService userService;

    // 删除用户
    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public ModelAndView deleteUser(@RequestParam("uId") char[] uId) throws Exception
    {
        int result = userService.deleteUser(uId);
        ModelAndView mv = new ModelAndView();
        if (result > 0)
        {
            mv.addObject("msg", "删除成功");
        }
        else
        {
            mv.addObject("msg", "删除失败");
        }
        mv.setViewName("result");
        return mv;
    }

    // 添加用户
    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public ModelAndView insertUser(User u) throws Exception
    {
        int result = userService.insertUser(u);
        ModelAndView mv = new ModelAndView();
        if (result > 0)
        {
            mv.addObject("msg", "添加成功");
        }
        else
        {
            mv.addObject("msg", "添加失败");
        }
        mv.setViewName("result");
        return mv;
    }

    // 查询用户
    @RequestMapping(value = "/selectUser", method = RequestMethod.GET)
    public ModelAndView selectUser(@RequestParam("uId") char[] uId) throws Exception
    {

        User user = userService.selectUser(uId);
        ModelAndView mv = new ModelAndView();
        if (user != null)
        {
            mv.addObject("user", user);
            mv.setViewName("userInfo");
        }
        else
        {
            mv.addObject("msg", "用户不存在");
            mv.setViewName("result");
        }
        return mv;
    }
}
