package Day16;

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");// step 2  class loader 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sam","root", "1234");//step 3 create connection
		
		Statement st = con.createStatement();// step 4
		//String query = "create table student(ID int primary key,SName varchar(20), SMarks int)";//step 6
		//String query = "insert into student values(1,'sam',20)";
		
		// Values insertion in to table
		//String query = "insert into student values(5,'sateesh',30)";
		//String query1 = "insert into student values(6,'amer',30)";
		//String query2 = "insert into student values(4,yogesh,'sam',42)";
		//st.executeUpdate(query);//steps 7
		//st.executeUpdate(query1);
		//st.executeUpdate(query2);
		
		//deleting row from table
		//String query3 = "delete from student where ID=2";
		
		//st.executeUpdate(query3);
		
		//updating data into table
		String query4 = "update student set SMarks=35 where ID=4"; 
		
		st.executeUpdate(query4);
		
		System.out.println("Student Table created successfully");
		
		System.out.println("Row inserted successfully");
		
	st.close();
	con.close();

	}

}
