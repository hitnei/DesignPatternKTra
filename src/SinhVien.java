

import java.util.Date;

public class SinhVien {
	String maSV;
	String hoTen;
	String ngaySinh;
	boolean gioiTinhNam;
	
	
	public SinhVien(String maSV, String hoTen, String ngaySinh, boolean gioiTinhNam) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinhNam = gioiTinhNam;
	}

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
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public boolean isGioiTinhNam() {
		return gioiTinhNam;
	}
	public void setGioiTinhNam(boolean gioiTinhNam) {
		this.gioiTinhNam = gioiTinhNam;
	}
}
