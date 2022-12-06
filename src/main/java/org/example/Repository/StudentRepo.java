package org.example.Repository;

import org.example.Model.Student;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
@Repository
public class StudentRepo implements StudentRepoImpl {
    String url="jdbc:mysql://localhost:3306/farzu";
    String username="root";
    String password="";

    @Override
    public void insertstudent(Student student) {
        String query="insert into student values('"+student.getId()+"','"+student.getName()+"','"+student.getEmail()+"')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement st=connection.createStatement();
            st.executeUpdate(query);



        }
        catch (Exception e){
            System.out.println(e);

        }

    }

    @Override
    public Boolean deletestudent(int id) {
        String  query= "Delete from student where id='"+id+"'";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement st=connection.createStatement();
            int result=st.executeUpdate(query);
            if(result==1){
                return true;
            }


        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
}
