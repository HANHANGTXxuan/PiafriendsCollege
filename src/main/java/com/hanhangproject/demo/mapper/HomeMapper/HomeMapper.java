package com.hanhangproject.demo.mapper.HomeMapper;

import com.hanhangproject.demo.entity.PHome;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HomeMapper {
    @Select("SELECT * FROM Piafriends_HomeTable WHERE pia_pairing=0 ORDER BY createdAt")
    @Results(value = {
            @Result(id = true,column = "pia_id", property = "id"),
            @Result(column = "pia_user_id" , property = "userId"),
            @Result(column = "pia_home_id" , property = "homeId"),
            @Result(column = "pia_request_scriptId" , property = "reqScriptId"),
            @Result(column = "pia_pairing" , property = "pairing"),
            @Result(column = "pia_inside" , property = "inside"),
    })
    PHome showScript();
}
