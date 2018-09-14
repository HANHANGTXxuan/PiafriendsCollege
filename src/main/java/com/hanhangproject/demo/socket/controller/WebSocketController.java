package com.hanhangproject.demo.socket.controller;

import com.hanhangproject.demo.entity.PScript;
import com.hanhangproject.demo.entity.PUser;
import com.hanhangproject.demo.mapper.ScriptMapper.Manage.ManageScript;
import com.hanhangproject.demo.mapper.UserMapper.PUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class WebSocketController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public String getMessage(String msg){
        return msg;
    }
}
