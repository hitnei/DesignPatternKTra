

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
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
	        
//	        dbSource.connectDatabase(dc, "SinhVien", "sa", "123");
//			String dc= InetAddress.getLocalHost().getHostName();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
