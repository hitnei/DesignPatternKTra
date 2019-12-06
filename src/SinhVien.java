

import java.io.Serializable;
import java.util.Date;

public class SinhVien implements Serializable {
	String maSV;
	String hoTen;
	Date ngaySinh;
	boolean gioiTinhNam;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
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
	public SinhVien(String maSV, String hoTen, Date ngaySinh, boolean gioiTinhNam) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinhNam = gioiTinhNam;
	}
	
	@Override
	public String toString() {
		return this.maSV + " - " + this.hoTen + " - " + this.ngaySinh + " - " + this.gioiTinhNam;
	}
	
}
