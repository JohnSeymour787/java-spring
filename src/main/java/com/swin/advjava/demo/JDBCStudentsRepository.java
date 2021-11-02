package com.swin.advjava.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JDBCStudentsRepository implements StudentsRepository
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final StudentRowMapper ROW_MAPPER = new StudentRowMapper();

    @Override
    public List<Student> findAll()
    {
        return jdbcTemplate.query("SELECT * from students_table", ROW_MAPPER);
    }
}