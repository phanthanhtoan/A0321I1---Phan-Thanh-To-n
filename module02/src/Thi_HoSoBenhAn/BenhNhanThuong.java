package Thi_HoSoBenhAn;

public class BenhNhanThuong extends BenhAn{
    private int phiNamVien;

    public BenhNhanThuong() {
    }

    public BenhNhanThuong(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhNhanThuong(String sttBenhAn, String maBenhAn, String maBenNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lydoNhapVien, int phiNamVien) {
        super(sttBenhAn, maBenhAn, maBenNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lydoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public int getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "BenhNhanThuong{" +
                "phiNamVien=" + phiNamVien +
                '}';
    }
}
