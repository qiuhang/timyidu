package com.timyidu.mapper.data1mapper;

import com.timyidu.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author qiuhang
 * @date 10:23 2019/3/14
 * describe:
 */
@Component
public interface User1Mapper {
    @Select("select * from user where id=#{id}")
    User lfindById(@Param("id") Integer id);
}
