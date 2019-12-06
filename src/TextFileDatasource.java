

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TextFileDatasource implements IDatasource {

	@Override
	public List<SinhVien> getAll() {
		try {
//		FileInputStream fis = new FileInputStream("d:/mydata2.bin");
		FileInputStream fis = new FileInputStream("./data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		List<SinhVien> list = new ArrayList<>(); 
		list= (List<SinhVien>) ois.readObject();

		fis.close();
		ois.close();
		
		return list;
		} catch (Exception ex) {
			System.out.println("Loi doc file: "+ex);
		}
		return null;
	}

	@Override
	public void save(List<SinhVien> list) {
		try {
//			FileOutputStream fos = new FileOutputStream("d:/mydata2.txt");
			FileOutputStream fos = new FileOutputStream("./data.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
					
			fos.close();
			oos.close();
			System.out.println("Save to text file!");
		} catch (IOException ex) {
			System.out.println("Error: "+ex);
		}
	}

	@Override
	public String createDatasource() {
		// TODO Auto-generated method stub
		return "TextFileDatasource";
	}

	@Override
	public void connectDatabase(String servername, String database, String un, String pass) {
		// TODO Auto-generated method stub
		
	}

}
