package com.gitdemo.mapper;

import com.gitdemo.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoMapper {

    @Select("select * from person")
    List<Person> testSelect();

}
