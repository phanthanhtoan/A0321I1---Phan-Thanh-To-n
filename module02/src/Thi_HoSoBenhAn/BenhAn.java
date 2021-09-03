package Thi_HoSoBenhAn;

import java.io.Serializable;

public abstract class BenhAn implements Serializable {
    private String sttBenhAn;
    private String maBenhAn;
    private String maBenNhan;
    private String tenBenhNhan;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lydoNhapVien;

    public  BenhAn() {
    }

    public BenhAn(String sttBenhAn, String maBenhAn, String maBenNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lydoNhapVien) {
        this.sttBenhAn = sttBenhAn;
        this.maBenhAn = maBenhAn;
        this.maBenNhan = maBenNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lydoNhapVien = lydoNhapVien;
    }

    public String getSttBenhAn() {
        return sttBenhAn;
    }

    public void setSttBenhAn(String sttBenhAn) {
        this.sttBenhAn = sttBenhAn;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getMaBenNhan() {
        return maBenNhan;
    }

    public void setMaBenNhan(String maBenNhan) {
        this.maBenNhan = maBenNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLydoNhapVien() {
        return lydoNhapVien;
    }

    public void setLydoNhapVien(String lydoNhapVien) {
        this.lydoNhapVien = lydoNhapVien;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "sttBenhAn='" + sttBenhAn + '\'' +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", maBenNhan='" + maBenNhan + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", lydoNhapVien='" + lydoNhapVien + '\'' +
                '}';
    }
}
