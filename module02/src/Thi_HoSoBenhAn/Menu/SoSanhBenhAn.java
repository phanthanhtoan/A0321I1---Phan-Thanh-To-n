package Thi_HoSoBenhAn.Menu;

import Thi_HoSoBenhAn.BenhAn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class SoSanhBenhAn implements Comparator<BenhAn> {
    @Override
    public int compare(BenhAn o1, BenhAn o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startdate1 = LocalDate.parse(o1.getNgayNhapVien(),formatter);
        LocalDate startdate2 = LocalDate.parse(o2.getNgayNhapVien(),formatter);
        LocalDate endday1 = LocalDate.parse(o1.getNgayRaVien(),formatter);
        LocalDate endday2 = LocalDate.parse(o1.getNgayNhapVien(),formatter);

        if (startdate1.compareTo(startdate2)>0){
            return 1;
        }else if (startdate1.compareTo(startdate2)<0){
            return -1;
        }else {
            if (endday1.compareTo(endday2)>0){
                return -1;
            }else if (endday1.compareTo(endday2) <0){
                return -1;
            }else {
                return 0;
            }
        }
    }

}
