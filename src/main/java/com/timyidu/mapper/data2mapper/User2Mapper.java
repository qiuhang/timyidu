package com.timyidu.mapper.data2mapper;

import com.timyidu.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author qiuhang
 * @date 10:28 2019/3/14
 * describe:
 */
@Component
public interface User2Mapper {
    @Select("select * from user where id=#{id}")
    User findById(@Param("id") Integer id);
}
