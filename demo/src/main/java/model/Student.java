package model;

public class Student {
	/**
	 * khai bao thuoc tinh
	 */
	
	private String maSV;
	private String hoTen;
	private String lop;
	
	/**
	 * set va get
	 */
	
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
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
	/**
	 * contruction student
	 */
	
	public Student(String maSV, String hoTen, String lop) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.lop = lop;
	}
	public Student() {};
}
