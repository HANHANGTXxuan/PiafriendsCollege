package com.hanhangproject.demo.controller;

import com.hanhangproject.demo.entity.PScript;
import com.hanhangproject.demo.entity.PUser;
import com.hanhangproject.demo.mapper.ScriptMapper.Manage.ManageScript;
import com.hanhangproject.demo.mapper.UserMapper.PUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class PScriptController {

    @Autowired
    private ManageScript uploadScript;
    @Autowired
    private PUserMapper pUserMapper;

    @RequestMapping(path = "/request/uploadScript",method = RequestMethod.POST)
    public boolean insert(Integer pia_user_id,char pia_release,String pia_simple_content,String pia_people_content,String pia_content_content){
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PScript script = new PScript();
        script.setUserId(pia_user_id);
        script.setReleased(pia_release);
        script.setSimpleData(pia_simple_content);
        script.setPeopleData(pia_people_content);
        script.setContentData(pia_content_content);
        script.setUpdatedAt(df.format(day));
        script.setCreatedAt(df.format(day));
        boolean b = uploadScript.insert(script);
        return b;
    }

    @RequestMapping(path = "/request/showScript",method = RequestMethod.POST)
    public PScript showRoomScript(Integer id){
        PScript script = uploadScript.showScript(id);
        return script;
    }

    @RequestMapping(path = "/request/showAllScript",method = RequestMethod.GET)
    public List<PScript> showAllScript(){
        List<PScript> script = uploadScript.showAllScript();
        for (int i = 0;i<script.size();i++){
            PUser user = pUserMapper.user(script.get(i).getUserId());
            script.get(i).setUser(user);
        }
        return script;
    }
}
