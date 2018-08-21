package com.hanhangproject.demo.mapper.ScriptMapper.Upload;

import com.hanhangproject.demo.entity.PScript;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PUploadScript {

    @Insert("INSERT INTO Piafriends_ScriptTable(pia_user_id,pia_script_simple,pia_script_people,pia_script_content,pia_script_released,updatedAt,createdAt)" +
            " VALUES(#{userId},#{simpleData},#{peopleData},#{contentData},#{released},#{updatedAt},#{createAt})")
    boolean insert(PScript scriptData);
}
