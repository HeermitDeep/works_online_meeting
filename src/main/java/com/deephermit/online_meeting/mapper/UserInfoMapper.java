package com.deephermit.online_meeting.mapper;

import com.deephermit.online_meeting.model.UserInfo;
import com.deephermit.online_meeting.util.CommonMapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper extends CommonMapper<UserInfo> {
    @Select("select * from user_info where user_id=#{id}")
    List<UserInfo> selectById(@Param("id") String id);
    @Select("select * from user_info where user_name=#{name}")
    List<UserInfo> selectByName(@Param("name") String name);
}