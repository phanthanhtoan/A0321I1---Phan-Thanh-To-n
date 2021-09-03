package Thi_HoSoBenhAn;


import bai16.Optional.Docfile_csv.Country;
import casestudy.data.ReadAndWrite;
import casestudy.utils.RegexData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChucNangBenhNhanThuongImpl implements ChucNangBenhAn {
    private static List<BenhNhanThuong> benhAnList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static final String REGEX_MABENHAN = "BA-[\\d]{3}";
    public static final String REGEX_MABENHNHAN = "BN-[\\d]{3}";
    public static final String REGEX_NGAYTHANG = "[\\d]{2}/[\\d]{2}/[\\d]{4}";

    //    static {
//        benhAnList = new ArrayList<>();
//        benhAnList.add(new BenhAn() {
//        }
//    }
    private String inputMaBenhAn() {
        System.out.println("Nhap ma benh an ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_MABENHAN, "Ban da nhap sai dinh dang, ten benh an phai co BA dau ma: ");
    }

    private String inputMaBenhNhan() {
        System.out.println("Nhap ten ten benh nhan ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_MABENHNHAN, "Ban da nhap sai dinh dang, ten benh anhan phai co BN dau ma:");
    }

    public String inputNgayThang() {
        System.out.println("Nhap ngay ra/xuat vien:");
        return RegexData.regexStr(scanner.nextLine(), REGEX_NGAYTHANG, "Ban da nhap sai dinh dang: ");
    }

    public String isBenhNhanThuong(String maBenhNhanThuong) {
        for (BenhNhanThuong benhNhanThuong : benhAnList) {
            if (benhNhanThuong.getMaBenNhan() == maBenhNhanThuong) {
                return maBenhNhanThuong;
            }
        }
        return null;
    }

    @Override
    public void disPlay() {
        benhAnList = (List<BenhNhanThuong>) ReadAndWrite.readFile("E:\\A0321I1 - Phan Thanh Toan\\A0321I1---Phan-Thanh-Toan\\module02\\src\\Thi_HoSoBenhAn\\data\\medical_records.csv");
        for (BenhNhanThuong benhNhanThuong : benhAnList) {
            System.out.println(benhNhanThuong.toString());
        }
    }

    @Override
    public void addNew() {

        System.out.println("Nhap stt benh an: ");
        String sttBenhAn = scanner.nextLine();

//        System.out.println("Nhap ma benh an: ");
//        String maBenhAn = scanner.nextLine();
        String maBenhAn = inputMaBenhAn();

//        System.out.println("Nhap ma benh nhan: ");
//        String maBenhNhan = scanner.nextLine();
        String maBenhNhan = inputMaBenhNhan();

        System.out.println("Nhap ten benh nhan: ");
        String tenBenhNhan = scanner.nextLine();

//        System.out.println("Nhap ngay nhap vien: ");
//        String ngayNhapVien = scanner.nextLine();
        String ngayNhapVien = inputNgayThang();
//        System.out.println("Nhap ra vien:  ");
//        String ngayRaVien = scanner.nextLine();
        String ngayRaVien = inputNgayThang();

        System.out.println("Nhap ly do nhap vien ");
        String lydoNhapVien = scanner.nextLine();

        System.out.println("Nhap phi nam vien ");
        int phiNamVien = Integer.parseInt(scanner.nextLine());

        BenhNhanThuong benhNhanThuong = new BenhNhanThuong(sttBenhAn, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lydoNhapVien, phiNamVien);
        benhAnList.add(benhNhanThuong);
        System.out.println("Them thanh cong");
        Thi_HoSoBenhAn.ReadAndWrite.writeFile(benhAnList, "E:\\A0321I1 - Phan Thanh Toan\\A0321I1---Phan-Thanh-Toan\\module02\\src\\Thi_HoSoBenhAn\\data\\medical_records.csv");


    }
    //(String sttBenhAn, String maBenhAn, String maBenNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lydoNhapVien) {

    @Override
    public void delete() {
        System.out.println("Nhap ma benh nhan can xoa: ");
        String maBenhNhanThuong = "";
        try {
            maBenhNhanThuong = scanner.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Sai ma benh nhan, nhap lai: ");
        }
        String benhNhanThuong = isBenhNhanThuong(maBenhNhanThuong);
        benhAnList.remove(maBenhNhanThuong);
        ReadAndWrite.writeFile(benhAnList, "E:\\A0321I1 - Phan Thanh Toan\\A0321I1---Phan-Thanh-Toan\\module02\\src\\Thi_HoSoBenhAn\\data\\medical_records.csv");
        System.out.println("Xoa thanh cong");
//        System.out.println("nhập mã bệnh án: ");
//        String maBenhAn = addMaBenhNhan();
//        Patient patient = isPatient(maBenhAn);
//        patientList.remove(patient);
//        ReadAndWrite.writeCharacter(patientList, "D:\\codegym\\A0321I1-Le-Manh-Hung-moduel2\\Module2\\src\\bai_thi_cuoi_module\\data.csv");
    }
}