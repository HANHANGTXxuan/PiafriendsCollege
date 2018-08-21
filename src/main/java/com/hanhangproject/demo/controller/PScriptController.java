package com.hanhangproject.demo.controller;

import com.hanhangproject.demo.entity.PScript;
import com.hanhangproject.demo.mapper.ScriptMapper.Upload.PUploadScript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class PScriptController {

    @Autowired
    private PUploadScript uploadScript;

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
        script.setCreateAt(df.format(day));
        boolean b = uploadScript.insert(script);
        return b;
    }
}
