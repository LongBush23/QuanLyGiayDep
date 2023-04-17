package javaoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyChucNang {
    private ArrayList<GiayDep> danhSachGiay;

    public QuanLyChucNang() {
        danhSachGiay = new ArrayList<GiayDep>();
    }

    public void hienThiMenu() {
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ GIÀY DÉP");
        System.out.println("1. Nhập danh sách giày dép");
        System.out.println("2. Xuất danh sách giày dép");
        System.out.println("0. Thoát chương trình");
        System.out.print("Mời bạn chọn chức năng (0-8): ");
    }

    public void chonChucNang() {
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            hienThiMenu();
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    xuatDanhSach();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình quản lý giày dép!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    break;
            }
        } while (luaChon != 0);
    }

    public void nhapDanhSach() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn loại giày để nhập (1. Giày dép, 2. Giày Sneaker, 3. Giày Boots, 4. Giày Sport, 0. Quay lại menu): ");
            int loaiGiay = scanner.nextInt();
            scanner.nextLine();
            if (loaiGiay == 0) {
                break;
            }

            System.out.print("Nhập mã giày: ");
            String id = scanner.nextLine();

            System.out.print("Nhập tên giày: ");
            String name = scanner.nextLine();
            
            System.out.println("Nhập size giày: ");
            String size = scanner.nextLine();

            System.out.print("Nhập giá giày: ");
            double price = scanner.nextDouble();

            System.out.print("Nhập số lượng giày: ");
            int soLuongGiay = scanner.nextInt();
            scanner.nextLine();

            switch (loaiGiay) {
                case 1:
                    GiayDep giayDep = new GiayDep(id, name, size, price, soLuongGiay);
                    danhSachGiay.add(giayDep);
                    break;
                case 2:
                    System.out.print("Nhập kiểu giày: ");
                    String kieuGiay = scanner.nextLine();

                    System.out.print("Nhập màu giày: ");
                    String mauGiay = scanner.nextLine();

                    GiaySneaker giaySneaker = new GiaySneaker(id, name, size, price, soLuongGiay, kieuGiay, mauGiay);
                    danhSachGiay.add(giaySneaker);
                    break;
                case 3:
                    System.out.print("Nhập chất liệu giày: ");
                    String chatLieuGiay = scanner.nextLine();

                    System.out.print("Nhập màu giày: ");
                    mauGiay = scanner.nextLine();

                    GiayBoots giayBoots = new GiayBoots(id, name, size, price, soLuongGiay, mauGiay, chatLieuGiay);
                    danhSachGiay.add(giayBoots);
                    break;
                case 4:
                    System.out.print("Nhập thương hiệu giày: ");
                    String thuongHieuGiay = scanner.nextLine();

                    System.out.print("Nhập độ bền giày: ");
                    String doBen = scanner.nextLine();

                    GiaySport giaySport = new GiaySport(id, name, size, price, soLuongGiay, thuongHieuGiay, doBen);
                    danhSachGiay.add(giaySport);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }
    public void xuatDanhSach() {
        if (danhSachGiay.isEmpty()) {
            System.out.println("Danh sách giày rỗng.");
            return;
        }

        for (GiayDep giay : danhSachGiay) {
            System.out.println(giay.toString());
            System.out.println();
        }
    }
    public void themGiayDep() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập mã giày: ");
        String id = scanner.nextLine();

        System.out.print("Nhập tên giày: ");
        String name = scanner.nextLine();
        
        System.out.println("Nhập size giày: ");
        String size = scanner.nextLine();

        System.out.print("Nhập giá giày: ");
        double price = scanner.nextDouble();

        System.out.print("Nhập số lượng giày: ");
        int soLuongGiay = scanner.nextInt();
        scanner.nextLine();

        GiayDep giayDep = new GiayDep(id, name, size, price, soLuongGiay);
        danhSachGiay.add(giayDep);
    }
    public void xoaGiayDep() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập mã giày cần xóa: ");
        String id = scanner.nextLine();
        
        boolean timThay = false;
        for (GiayDep giay : danhSachGiay) {
            if (giay.getId().equals(id)) {
                danhSachGiay.remove(giay);
                System.out.println("Xóa thành công.");
                timThay = true;
                break;
            }
        }
        
        if (!timThay) {
            System.out.println("Không tìm thấy giày có mã " + id + " trong danh sách.");
        }
    }
    public void capNhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập mã giày cần chỉnh sửa: ");
        String id = scanner.nextLine();
        
        boolean timThay = false;
        for (GiayDep giay : danhSachGiay) {
            if (giay.getId().equals(id)) {
                System.out.print("Nhập tên giày mới: ");
                String name = scanner.nextLine();
                
                System.out.println("Nhập size giày mới: ");
                String size = scanner.nextLine();

                System.out.print("Nhập giá giày mới: ");
                double price = scanner.nextDouble();

                System.out.print("Nhập số lượng giày mới: ");
                int soLuongGiay = scanner.nextInt();
                scanner.nextLine();

                giay.setNameShoe(name);
                giay.setSize(size);
                giay.setPrice(price);
                giay.setQuantity(soLuongGiay);
                
                System.out.println("Chỉnh sửa thành công.");
                timThay = true;
                break;
            }
        }
        
        if (!timThay) {
            System.out.println("Không tìm thấy giày có mã " + id + " trong danh sách.");
        }
    }
    public void timKiemGiayTheoId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã giày cần tìm: ");
        String id = scanner.nextLine();
        
        for (GiayDep giay : danhSachGiay) {
            if (giay.getId().equals(id)) {
                System.out.println(giay.toString());
                return;
            }
        }
        System.out.println("Không tìm thấy giày có mã là " + id);
    }

    public void sapXepGiayTheoGiaGiam() {
        Collections.sort(danhSachGiay, new Comparator<GiayDep>() {
            @Override
            public int compare(GiayDep giay1, GiayDep giay2) {
                if (giay1.getPrice() < giay2.getPrice()) {
                    return -1;
                } else if (giay1.getPrice() == giay2.getPrice()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
    }
    public void sapXepGiayTheoGiaTang() {
        Collections.sort(danhSachGiay, new Comparator<GiayDep>() {
            @Override
            public int compare(GiayDep giay1, GiayDep giay2) {
                if (giay1.getPrice() > giay2.getPrice()) {
                    return -1;
                } else if (giay1.getPrice() == giay2.getPrice()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
    }


}

           
