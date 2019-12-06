

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program {
	public static void printOut(List<SinhVien> list) {
		for (SinhVien sinhVien : list) {
			System.out.println(sinhVien.getMaSV());
			System.out.println(sinhVien.getHoTen());
			System.out.println(sinhVien.getNgaySinh());
			System.out.println(sinhVien.isGioiTinhNam()==true? "Nam" : "Nu");
			System.out.println("------------------------");
		}
	}

	public static void main(String[] args) {
        try {
//        	FakeSource
	        IDatasource fakeSource = DatasourceFactory.createDatasource(DatasourceType.FakeDatasource);
	        List<SinhVien> fake = fakeSource.getAll();
//	        printOut(fake);
	        
//	        TextSource
	        IDatasource fileSource = DatasourceFactory.createDatasource(DatasourceType.TextFileDatasource);
	        fileSource.save(fake);
	        List<SinhVien> lstFromFile = fileSource.getAll();
	        printOut(lstFromFile);

//	        SQLSERVER
			String dc= InetAddress.getLocalHost().getHostName();
	        IDatasource datasource1 = DatasourceFactory.createDatasource(DatasourceType.SQLServerDatasource);
	        datasource1.connectDatabase(dc, "SinhVien", "sa", "123");
	        
	        List<SinhVien> lstSV = datasource1.getAll();
	        printOut(lstSV);
	        
	        // save();
	        for (SinhVien sinhVien : lstSV) {
	        	SinhVien sv = sinhVien;
	        	sv.setMaSV(sinhVien.getMaSV() + lstSV.size());
			}
	        datasource1.save(lstSV);
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
