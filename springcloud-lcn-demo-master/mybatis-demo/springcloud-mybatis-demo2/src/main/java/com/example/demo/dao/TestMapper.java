package com.example.demo.dao;

import com.example.demo.entity.Test;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by lorne on 2017/6/28.
 */
@Mapper
public interface TestMapper {


    @Select("SELECT * FROM t_test")
    List<Test> findAll();

    @Insert("INSERT INTO t_test(NAME) VALUES(#{name})")
    int save(@Param("name") String name);

    @Update("update t_test set name = #{name} where id = #{id}")
    int update(@Param("id") Integer id, @Param("name") String name);

    @Delete("delete from t_test where id = #{id}")
    int delete(@Param("id") Integer id);

    @Select("select * from t_test where id = #{id}")
    Test select(@Param("id") Integer id);

}
