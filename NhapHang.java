package main;
import java.util.Date;

public class NhapHang extends KhoHang {
 private Date ngayNhap;
 private Double thanhTien;
 private String matHang;
public NhapHang(String maHang, String nhomHang, String chatLieu, Double soLuong, Double donGia, Date ngayNhap,
		Double thanhTien, String matHang) {
	super(maHang, nhomHang, chatLieu, soLuong, donGia);
	this.ngayNhap = ngayNhap;
	this.thanhTien = thanhTien;
	this.matHang = matHang;
}
public Date getNgayNhap() {
	return ngayNhap;
}
public void setNgayNhap(Date ngayNhap) {
	this.ngayNhap = ngayNhap;
}
public Double getThanhTien() {
	return thanhTien;
}
public void setThanhTien(Double thanhTien) {
	this.thanhTien = thanhTien;
}
public String getMatHang() {
	return matHang;
}
public void setMatHang(String matHang) {
	this.matHang = matHang;
}
@Override
	public String toString() {
		return "NhapHang" +super.toString()+"\nNgayNhap:"+this.ngayNhap+"\nThanhTien:"+this.thanhTien+"\nMatHang:"+this.matHang;
	}
}


