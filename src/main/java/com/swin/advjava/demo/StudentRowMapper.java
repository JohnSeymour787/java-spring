package com.swin.advjava.demo;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student>
{
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        String name = rs.getString("name");
        long id = rs.getLong("id");
        return new Student(name, id);
    }
}