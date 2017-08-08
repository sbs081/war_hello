package com.makotojava.com.intro.mapper;

import com.makotojava.com.intro.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by aronwong on 8/4/17.
 */
public interface PersonMapper {
    void insertPerson(@Param("data") Person data);
    void batchInsertPerson(List<Person> data);
    void deletePerson(Map data);
}



