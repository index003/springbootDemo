package com.how2java.springboot.mapper;
 
import java.util.List;
 
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
 
import com.how2java.springboot.pojo.Category;
 
/*
 使用注解@Mapper 表示这是一个Mybatis Mapper接口。
使用@Select注解表示调用findAll方法会去执行对应的sql语句。
 */
@Mapper
public interface CategoryMapper {
 
    @Select("select * from category_ ")
    List<Category> findAll();
 
}