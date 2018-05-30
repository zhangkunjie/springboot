package com.springboot.dao;


import com.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by user on 2018/1/8.
 */
@Mapper
public interface StudentDao extends BaseDao<Student, Long> {

}
