

import java.util.ArrayList;
import java.util.List;

public class FakeDatasource implements IDatasource {

	@Override
	public List<SinhVien> getAll() {
		// TODO Auto-generated method stub
//		SinhVien nvTrung = new SinhVien(001, "Nguyen Van Trung", "12/3/2019", true);
//		SinhVien lvtLan = new SinhVien(002, "Le Van Tuong Lan", "31/1/2019", false);
//		
//		List<SinhVien> lst = new ArrayList<SinhVien>();
//		lst.add(nvTrung);
//		lst.add(lvtLan);
//		return lst;
		
		return null;
	}

	@Override
	public void save(List<SinhVien> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String createDatasource() {
		// TODO Auto-generated method stub
		return "FakeDatasource";
	}

	@Override
	public void connectDatabase(String servername, String database, String un, String pass) {
		// TODO Auto-generated method stub
		
	}

}
