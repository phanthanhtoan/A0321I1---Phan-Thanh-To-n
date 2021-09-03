package Thi_HoSoBenhAn;

public class BenhNhanVip  extends BenhAn{
    private String loaiBenhNhan;
    private String thoiHanVip;

    public BenhNhanVip() {
    }

    public BenhNhanVip(String loaiBenhNhan, String thoiHanVip) {
        this.loaiBenhNhan = loaiBenhNhan;
        this.thoiHanVip = thoiHanVip;
    }

    public BenhNhanVip(String sttBenhAn, String maBenhAn, String maBenNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lydoNhapVien, String loaiBenhNhan, String thoiHanVip) {
        super(sttBenhAn, maBenhAn, maBenNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lydoNhapVien);
        this.loaiBenhNhan = loaiBenhNhan;
        this.thoiHanVip = thoiHanVip;
    }

    public String getLoaiBenhNhan() {
        return loaiBenhNhan;
    }

    public void setLoaiBenhNhan(String loaiBenhNhan) {
        this.loaiBenhNhan = loaiBenhNhan;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return super.toString()+
                "BenhNhanVip{" +
                "loaiBenhNhan='" + loaiBenhNhan + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'' +
                '}';
    }
}
