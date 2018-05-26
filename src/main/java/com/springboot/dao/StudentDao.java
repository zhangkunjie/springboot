package com.springboot.dao;

import com.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by user on 2018/1/8.
 */
public interface StudentDao extends BaseDao<Student, Long> {
    public List<Student> findAll(Student studentModel);

    public List<Map<String, String>> findAllMapList(Student studentModel);

    public Student findStudentById(Map<String, Integer> param);

}
