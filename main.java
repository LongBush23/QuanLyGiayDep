package javaoop;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyChucNang chucNang = new QuanLyChucNang();
        int choice;
        do {
	        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ GIÀY DÉP");
	        System.out.println("1. Nhập danh sách giày dép");
	        System.out.println("2. Xuất danh sách giày dép");
	        System.out.println("3. Nhập thêm giày ");
	        System.out.println("4. Cập nhật thông tin giày dép");
	        System.out.println("5. Tra cứu giày dép");
	        System.out.println("6. Xóa giày dép");
	        System.out.println("7. Sắp xếp giày dép theo giá tang dần");
	        System.out.println("8. Sắp xếp giày dép theo giá giam dần");
	        System.out.println("0. Thoát chương trình");
	        System.out.print("Mời bạn chọn chức năng (0-7): ");
	        choice = scanner.nextInt();
	        switch (choice) {
	            case 1:
	                chucNang.nhapDanhSach();
	                break;
	            case 2:
	            	chucNang.xuatDanhSach();
	                break;
	            case 3:
	            	chucNang.themGiayDep();
	            	break;
	            case 4:
	            	chucNang.capNhapThongTin();
	                break;
	            case 5:
	            	chucNang.timKiemGiayTheoId();
	                break;
	            case 6:
	            	chucNang.xoaGiayDep();
	                break;
	            case 7:
	            	chucNang.sapXepGiayTheoGiaGiam();
	                break;
	            case 8:
	            	chucNang.sapXepGiayTheoGiaTang();
	                break;
	            case 0:
	                System.out.println("Cảm ơn bạn đã sử dụng chương trình quản lý giày dép!");
	                break;
	            default:
	                System.out.println("Bạn đã chọn sai chức năng. Mời chọn lại.");
	                break;
	        }
	    } while (choice != 0);
    }
}
