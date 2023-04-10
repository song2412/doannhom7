package main;
import java.util.Scanner;
   public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Danhsachkhoquanao dskqa=new Danhsachkhoquanao();
		int luaChon=0;
		do {
			System.out.println("------Menu-----");
		    System.out.println("Chon chuc nang");
		    System.out.println(
		      "1.Them mat hang vao kho.\n"
		      + "2.In danh sach co trong kho trong kho.\n"
		      +"3.Kiem tra mat hang co ton tai khong dua tren ma hang.\n"
		      +"4.Xoa mot mat hang ra khoi danh sach.\n"
		      +"5.Xuat ra danh sach mat hang giam dan theo don gia.\n"
		      +"0.Thoat chuong trinh" );
		     luaChon=sc.nextInt();
		     sc.nextLine();
		     if(luaChon==1) {
		    System.out.println("Nhap ma hang:");String maHang=sc.nextLine();
		    System.out.println("Nhap nhom hang:");String nhomHang=sc.nextLine();
		    System.out.println("Nhap chat ieu:");String chatLieu=sc.nextLine();
		    System.out.println("Nhap don gia");Double donGia=sc.nextDouble();
		    System.out.println("Nhap so luong:");Double soLuong=sc.nextDouble();
		    KhoHang kh=new KhoHang(maHang, nhomHang, chatLieu, soLuong, donGia);
		    dskqa.themMatHang(kh);
		     }else if(luaChon==2) {
		     dskqa.inDanhsachmathang();
		     }else if(luaChon==3) {
		    System.out.println("Nhap ma hang: ");String maHang=sc.nextLine();
		    KhoHang kh= new KhoHang( maHang, null, null, null,null);
		    System.out.println("Kiểm tra : "+dskqa.kiemTraTonTai(kh));
		     }else if(luaChon==4) {
		    System.out.println("Nhap ma hang: ");String maHang=sc.nextLine();
		    KhoHang kh= new KhoHang(maHang, null, null, null, null);
		    System.out.println("Xoa mat hang ra khoi danh sach :"+dskqa.xoaMatHang(kh));
		     }else if(luaChon==5) {
		    dskqa.sapXepMatHangGiamDan();
		    dskqa.inDanhsachmathang();
		     }
		} while (luaChon!=0);	
	}
	}
   
