

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FakeDatasource implements IDatasource {

	@Override
	public List<SinhVien> getAll() {
		try {
			SinhVien nvTrung = new SinhVien(1, "Nguyen Van Trung", new SimpleDateFormat("dd/MM/yyyy").parse("31/1/2019"), true);
			SinhVien lvtLan = new SinhVien(2, "Le Van Tuong Lan", new SimpleDateFormat("dd/MM/yyyy").parse("31/1/2019"), false);
			List<SinhVien> lst = new ArrayList<SinhVien>();
			lst.add(nvTrung);
			lst.add(lvtLan);
			return lst;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
