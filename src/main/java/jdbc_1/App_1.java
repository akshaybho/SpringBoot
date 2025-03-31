package jdbc_1;

import JDBC_RowMapper.StudentRowMapper;
import JDBC_classes.Student;
import jdbc.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class App_1 {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        JdbcTemplate jt = context.getBean(JdbcTemplate.class);

        //----INSERT OPERATION-------------
       /* int std_rollno = 102;
        String std_name = "Akshay";
        float std_marks = 96.2f;
        String insert_sql_query = "INSERT INTO Student VALUES(?,?,?)";
        int count = jt.update(insert_sql_query, std_rollno, std_name, std_marks);
        if(count>0)
        {
            System.out.println("Insertion success");
        }
        else
        {
            System.out.println("Insertion fail");
        }

        //----UPDATE OPERATION------
        float marks = 97.2f;
        int rollno = 102;

        String update_sql_query = "UPDATE student SET std_marks=? WHERE std_roll=?";
        int count = jt.update(update_sql_query, marks, rollno);

        if(count>0)
        {
            System.out.println("Update Successful");
        }
        else
        {
            System.out.println("Update Fail");
        }

        //-------DELETE OPERATION----------
        int rollno = 101;

        String delete_sql_query = "DELETE FROM student WHERE std_roll=?";
        int count = jt.update(delete_sql_query, rollno);

        if(count>0)
        {
            System.out.println("successfully deleted");
        }
        else
        {
            System.out.println("Not able to delete due to some error");
        }*/

        //-----SELECT OPERATION--------

        String select_sql_query = "SELECT *FROM student";
        List<Student> std_list = jt.query(select_sql_query, new StudentRowMapper());
        for(Student std : std_list)
        {
            System.out.println("Roll no : "+std.getRollno());
            System.out.println("Name : "+std.getName());
            System.out.println("Marks : "+std.getMarks());
            System.out.println("----------------------------------------");
        }
    }
}
