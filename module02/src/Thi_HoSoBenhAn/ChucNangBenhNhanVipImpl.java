package Thi_HoSoBenhAn;

import casestudy.data.ReadAndWrite;
import casestudy.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChucNangBenhNhanVipImpl implements ChucNangBenhAn{

    private static List<BenhNhanVip> benhNhanVips = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static final String REGEX_MABENHAN ="BA-[\\d]{3}";
    public static final String REGEX_MABENHNHAN = "BN-[\\d]{3}";
    public static final String REGEX_NGAYTHANG = "[\\d]{2}/[\\d]{2}/[\\d]{4}";

    private String inputMaBenhAn(){
        System.out.println("Nhap ma benh an ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_MABENHAN, "Ban da nhap sai dinh dang, ten benh an phai co BA dau ma: ");
    }

    private String inputMaBenhNhan(){
        System.out.println("Nhap ten ten benh nhan ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_MABENHNHAN, "Ban da nhap sai dinh dang, ten benh anhan phai co BN dau ma:");
    }

    public String inputNgayThang(){
        System.out.println("Nhap ngay vao/xuat vien:(nhap truoc, xuat sau)" );
        return RegexData.regexStr(scanner.nextLine(), REGEX_NGAYTHANG, "Ban da nhap sai dinh dang: ");
    }

    public String isBenhNhanVip(String maBeNhanVip) {
        for (BenhNhanVip benhNhanVip : benhNhanVips) {
            if (benhNhanVip.getMaBenNhan() == maBeNhanVip) {
                return maBeNhanVip;
            }
        }
        return null;
    }
    @Override
    public void disPlay() {
        benhNhanVips = (List<BenhNhanVip>) ReadAndWrite.readFile("E:\\A0321I1 - Phan Thanh Toan\\A0321I1---Phan-Thanh-Toan\\module02\\src\\Thi_HoSoBenhAn\\data\\medical_records.csv");
        for (BenhNhanVip benhNhanVip : benhNhanVips) {
            System.out.println(benhNhanVip.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhap stt benh an: ");
        String sttBenhAn = scanner.nextLine();

//        System.out.println("Nhap ma benh an: ");
//        String maBenhAn = scanner.nextLine();
        String maBenhAn = inputMaBenhAn();

        String  maBenhNhan = inputMaBenhNhan();
//        System.out.println("Nhap ma benh nhan: ");
//        String maBenhNhan = scanner.nextLine();

        System.out.println("Nhap ten benh nhan: ");
        String tenBenhNhan = scanner.nextLine();

       // System.out.println("Nhap ngay nhap vien: ");
        String ngayNhapVien = inputNgayThang();

       // System.out.println("Nhap ra vien:  ");
        String ngayRaVien = inputNgayThang();

        System.out.println("Nhap ly do nhap vien ");
        String lydoNhapVien = scanner.nextLine();

        System.out.println("Nhap loai be nhan:  ");
        String loaiBenNhan = scanner.nextLine();

        System.out.println("Nhap thoi han vip:   ");
        String thoiHanVip = scanner.nextLine();

        //(String sttBenhAn, String maBenhAn, String maBenNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lydoNhapVien, String loaiBenhNhan, String thoiHanVip) {
        BenhNhanVip benhNhanVip = new BenhNhanVip(sttBenhAn, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lydoNhapVien, loaiBenNhan, thoiHanVip);
       benhNhanVips.add(benhNhanVip);
        Thi_HoSoBenhAn.ReadAndWrite.writeFile(benhNhanVips, "E:\\A0321I1 - Phan Thanh Toan\\A0321I1---Phan-Thanh-Toan\\module02\\src\\Thi_HoSoBenhAn\\data\\medical_records.csv");
    }

    @Override
    public void delete() {
        System.out.println("Nhap ma benh nhan can xoa: ");
        String maBenhNhanVip ="";
        try {
            maBenhNhanVip = scanner.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Sai ma benh nhan, nhap lai: ");
        }
        String benhNhanVip =isBenhNhanVip(maBenhNhanVip);
        benhNhanVips.remove(maBenhNhanVip);
        ReadAndWrite.writeFile(benhNhanVips, "E:\\A0321I1 - Phan Thanh Toan\\A0321I1---Phan-Thanh-Toan\\module02\\src\\Thi_HoSoBenhAn\\data\\medical_records.csv");
        System.out.println("Xoa thanh cong");
    }
}
