

import java.util.List;

public interface IDatasource {
	String createDatasource();
	List<SinhVien> getAll();
	void save(List<SinhVien> list);
	void connectDatabase(String servername, String database, String un, String pass);
	
}
