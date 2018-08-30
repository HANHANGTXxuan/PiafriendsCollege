package com.hanhangproject.demo.controller;

import com.hanhangproject.demo.entity.PUser;
import com.hanhangproject.demo.mapper.UserMapper.PUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PUserController {

    @Autowired
    private PUserMapper userMapper;

    @RequestMapping(path = "/request/getData",method = RequestMethod.POST)
    public PUser getData(long telephone,String password){
        PUser user = userMapper.getData(telephone,password);
        user.setPiaFuns(userMapper.follow(user.getPiaId()).size());
        user.setPiaFollows(userMapper.funs(user.getPiaId()).size());
        return user;
    }

    @RequestMapping(path = "/request/login",method = RequestMethod.POST)
    public boolean login(long telephone,String password){
        if (userMapper.login(telephone,password)){
            return true;
        }
        return false;
    }

    @RequestMapping(path = "/request/getUser",method = RequestMethod.GET)
    public PUser getData(Integer id){
        PUser user = userMapper.user(id);
        user.setPiaFollows(userMapper.follow(id).size());
        user.setPiaFuns(userMapper.funs(id).size());
        return user;
    }
}
