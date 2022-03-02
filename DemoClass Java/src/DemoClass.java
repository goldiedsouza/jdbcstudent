import java.sql.*;

/*import ---> java.sql
 * load and register the driver --> com.mysql.jbdc.Driver
 * Create connection
 * Create statement
 * execute the query
 * process the result
 * close the connection
 */
public class DemoClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Goldie","root","Goldie1498");
		
		Statement st = con.createStatement();
		
		String query = "create table student(ID int, SName varchar(20),SMarks int)";
		//String query1 = "insert into student Value(1,'Purva',200)";
		//String query2 = "Delete from Student Where ID=2";
		String query3 = "Update Student Set SName='Yash' Where ID=3";
		//String query2
		//st.executeUpdate(query);
		st.executeUpdate(query3);
		System.out.println("Student Table created successful");
		st.close();
		con.close();
	}

}

