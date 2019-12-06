

import java.net.InetAddress;
import java.net.UnknownHostException;
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
			String dc= InetAddress.getLocalHost().getHostName();
//	        System.out.println(dc);
	        IDatasource datasource1 = DatasourceFactory.createDatasource(DatasourceType.SQLServerDatasource);
	        datasource1.connectDatabase(dc, "SinhVien", "sa", "123");
	        
	        List<SinhVien> lstSV = datasource1.getAll();
	        for (SinhVien sinhVien : lstSV) {
				System.out.println(sinhVien.getHoTen());
				System.out.println(sinhVien.getNgaySinh());
				System.out.println(sinhVien.isGioiTinhNam()==true? "nam" : "nu");
			}
//	        datasource1.getAll();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
