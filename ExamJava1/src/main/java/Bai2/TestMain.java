package Bai2;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Nhap NhanVien co san
        KyThuat kt = new KyThuat("TP1234","Bui Xuan Hung","23/07/2000","Hai Duong", "Progammer");
        System.out.println(kt);
        // Nhap NhanVien tu ban phim
        KyThuat kt2 = new KyThuat();
        System.out.println("Nhap maNhanVien: ");
        kt2.maNhanVien = input.nextLine();
        System.out.println("Nhap hoTen: ");
        kt2.hoTen = input.nextLine();
        System.out.println("Nhap namSinh: ");
        kt2.namSinh = input.nextLine();
        System.out.println("Nhap diaChi: ");
        kt2.diaChi = input.nextLine();
        System.out.println("Nhap chuyenNganh: ");
        kt2.chuyenNganh = input.nextLine();
        System.out.println(kt2);
    }
}
