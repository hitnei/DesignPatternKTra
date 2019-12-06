

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLServerDatasource implements IDatasource {
	public static Connection cn;
	
	@Override
	public List<SinhVien> getAll() {
		// TODO Auto-generated method stub
		ResultSet rs;
		List<SinhVien> lst = new ArrayList<SinhVien>();
		try {
//			String sql="select * from SinhVien";
//			PreparedStatement cmd;
//			cmd = cn.prepareStatement(sql);
//			System.out.println(cmd.ne);
			
			String sql = "select * from SinhVien";
	        Statement cmd = cn.createStatement();
	        rs = cmd.executeQuery(sql);
	        while (rs.next()){
//                System.out.println(rs.getString(3));
//                boolean gt =  (rs.getBoolean(2)==true)? true : false;
                SinhVien sv = new SinhVien(rs.getString(1), rs.getString(2), rs.getDate(4), rs.getBoolean(3));
                lst.add(sv);
            }
//	        System.out.println(lst);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public void save(List<SinhVien> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String createDatasource() {
		// TODO Auto-generated method stub
		return "SQLServerDatasource";
	}
	

	@Override
	public void connectDatabase(String servername, String database, String un, String pass) {
		// TODO Auto-generated method stub	        
        try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Da xac dinh HQLCSDL");
			String url=String.format("jdbc:sqlserver://%s:1433;databaseName=%s;user=%s; password=%s", servername, database, un, pass);
			cn=DriverManager.getConnection(url);
			System.out.println("da ket noi den " + database);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
