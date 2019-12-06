import java.io.Serializable;
import java.util.Date;

public class SinhVien implements Serializable {
	int maSV;
	String hoTen;
	Date ngaySinh;
	boolean gioiTinhNam;

	public SinhVien(int maSV, String hoTen, Date ngaySinh, boolean gioiTinhNam) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinhNam = gioiTinhNam;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public boolean isGioiTinhNam() {
		return gioiTinhNam;
	}
	public void setGioiTinhNam(boolean gioiTinhNam) {
		this.gioiTinhNam = gioiTinhNam;
	}
	@Override
	public String toString() {
		return this.maSV + " - " + this.hoTen + " - " + this.ngaySinh + " - " + this.gioiTinhNam;
	}
}
