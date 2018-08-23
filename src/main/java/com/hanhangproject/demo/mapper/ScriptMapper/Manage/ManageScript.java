package com.hanhangproject.demo.mapper.ScriptMapper.Manage;

import com.hanhangproject.demo.entity.PScript;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ManageScript {

    @Insert("INSERT INTO Piafriends_ScriptTable(,pia_user_id,pia_script_simple,pia_script_people,pia_script_content,pia_script_released,updatedAt,createdAt)" +
            " VALUES(#{userId},#{simpleData},#{peopleData},#{contentData},#{released},#{updatedAt},#{createAt})")
    boolean insert(PScript scriptData);

    @Select("SELECT * FROM Piafriends_ScriptTable WHERE pia_id=#{id} AND released = 1 AND toexamined = 1")
    @Results(value = {
            @Result(id = true,column = "pia_id", property = "id"),
            @Result(column = "pia_user_id" , property = "userId"),
            @Result(column = "pia_script_simple" , property = "simpleData"),
            @Result(column = "pia_script_people" , property = "peopleData"),
            @Result(column = "pia_script_content" , property = "contentData"),
            @Result(column = "pia_script_released" , property = "released"),
            @Result(column = "pia_script_toexamined" , property = "toexamined"),
    })
    PScript showScript(Integer id);
}
