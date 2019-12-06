

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;


public class SQLServerDatasource implements IDatasource {
	
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
                SinhVien sv = new SinhVien(rs.getInt(1), rs.getString(2), rs.getDate(4), rs.getBoolean(3));
                lst.add(sv);
            }
//	        System.out.println(lst);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

    public static Connection cn;
	@Override
	public void save(List<SinhVien> list) {
		// TODO Auto-generated method stub

        for (SinhVien sinhVien : list){

            String sql = "INSERT INTO SinhVien values(?, ?, ?, ?)";
            
            try {
                PreparedStatement cmd = cn.prepareStatement(sql);
                cmd.setInt(1, sinhVien.getMaSV());
                cmd.setString(2, sinhVien.getHoTen());
                cmd.setBoolean(3, sinhVien.isGioiTinhNam());
                cmd.setDate(4, (Date)sinhVien.getNgaySinh());
				cmd.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
        }
        
		
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
