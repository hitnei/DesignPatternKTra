//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class MySqlDatasource implements IDatasource {
//	
//	public static Connection connectDb(String DB_USERNAME, String DB_PASSWORD, String DB_DBNAME) {
////		String DB_USERNAME = "admin";
////	    String DB_PASSWORD = "987";
////	    String DB_DBNAME = "rmiQlsv";
//	    String DB_URL = String.format("jdbc:mysql://localhost:3306/%s", DB_DBNAME);
//	    String DB_DRV = "com.mysql.jdbc.Driver";
//	    
//	    Connection conn = null;
//	    
//	    try {
//            Class.forName(DB_DRV);
//            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//            System.out.println("Database connnected!");
//            
//            return conn;
//        } catch (ClassNotFoundException | SQLException ex) {
//            ex.printStackTrace();
//            return null;
//        }
//	}
//
//	@Override
//	public String createDatasource() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<SinhVien> getAll() {
//		try {
//            String query = "SELECT * FROM SinhVien";
//            Statement cmd = connectDb("admin", "987", "SinhVien").createStatement();
//            ResultSet rs = cmd.executeQuery(query);
//            
//            List<SinhVien> lst = new ArrayList<>();
//            while(rs.next()) {
//            	lst.add(new SinhVien(
//                        rs.getInt(1), 
//                        rs.getString(2), 
//                        new Date(rs.getDate(3)),
//            			rs.getBoolean(3));
//            }
//            
//            return lstStudents;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return null;
//        }
//		return null;
//	}
//
//	@Override
//	public void save(List<SinhVien> list) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void connectDatabase(String servername, String database, String un, String pass) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
