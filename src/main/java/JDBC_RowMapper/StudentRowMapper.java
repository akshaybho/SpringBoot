package JDBC_RowMapper;

import JDBC_classes.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        Student std = new Student();

        std.setName(rs.getString("std_name"));
        std.setMarks(rs.getFloat("std_marks"));
        std.setRollno(rs.getInt("std_roll"));

        return std;
    }
}
