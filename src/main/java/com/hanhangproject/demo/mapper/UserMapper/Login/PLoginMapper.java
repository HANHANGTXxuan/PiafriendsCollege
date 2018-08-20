package com.hanhangproject.demo.mapper.UserMapper.Login;

import com.hanhangproject.demo.entity.PFollows;
import com.hanhangproject.demo.entity.PUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PLoginMapper {

    @Select("SELECT * FROM Piafriends_UserTable WHERE pia_telephone =#{telephone} AND pia_password = #{password}")
    boolean login(@Param("telephone")long telephone,@Param("password")String password);

    @Select("SELECT * FROM Piafriends_UserTable WHERE pia_telephone =#{telephone} AND pia_password = #{password}")
    @Results(value = {
            @Result(id = true,column = "pia_id", property = "piaId"),
            @Result(column = "pia_avatar",property = "piaAvatar"),
            @Result(column = "pia_telephone",property = "piaTelephone"),
            @Result(column = "pia_username",property = "piaUsername"),
            @Result(column = "pia_text",property = "piaText"),
            @Result(column = "pia_sex",property = "piaSex"),
            @Result(column = "pia_coin",property = "piaCoin"),
            @Result(column = "pia_email",property = "piaEmail"),
            @Result(column = "pia_birthday",property = "piaBirthday"),
            @Result(column = "createAt",property = "createAt")
    })
    PUser getData(@Param("telephone")long telephone,@Param("password")String password);

    @Select("SELECT * FROM Piafriends_FollowsTable WHERE pia_follow_id=#{followId}")
    @Results(value = {
            @Result(id = true,column = "id", property = "pia_id"),
            @Result(column = "PiaUserId" , property = "pia_user_id"),
            @Result(column = "PiaFollowId" , property = "pia_follow_id")
    })
    List<PFollows> follow(int followId);

    @Select("SELECT * FROM Piafriends_FollowsTable WHERE pia_user_id=#{funsId}")
    @Results(value = {
            @Result(id = true,column = "id", property = "pia_id"),
            @Result(column = "PiaUserId" , property = "pia_user_id"),
            @Result(column = "PiaFollowId" , property = "pia_follow_id")
    })
    List<PFollows> funs(int funsId);
}
