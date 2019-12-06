

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        IDatasource datasource = DatasourceFactory.createDatasource(DatasourceType.FakeDatasource);
//        List<SinhVien> lst = datasource.getAll();
//        for (int i=0; i< lst.size(); i++) {
//        	System.out.println(lst.get(i).getHoTen()); // MySQLDatasource
//        }

        try {
        	// getAll();
			String dc= InetAddress.getLocalHost().getHostName();
//	        System.out.println(dc);
	        IDatasource datasource1 = DatasourceFactory.createDatasource(DatasourceType.SQLServerDatasource);
	        datasource1.connectDatabase(dc, "SinhVien", "sa", "123");
	        
	        List<SinhVien> lstSV = datasource1.getAll();
	        for (SinhVien sinhVien : lstSV) {
				System.out.println(sinhVien.getMaSV());
				System.out.println(sinhVien.getHoTen());
				System.out.println(sinhVien.getNgaySinh());
				System.out.println(sinhVien.isGioiTinhNam()==true? "nam" : "nu");
				System.out.println("------------------------");
			}
	        
	        // save();
	        for (SinhVien sinhVien : lstSV) {
	        	SinhVien sv = sinhVien;
	        	sv.setMaSV(sinhVien.getMaSV() + lstSV.size());
			}
	        
	        datasource1.save(lstSV);
	 
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
