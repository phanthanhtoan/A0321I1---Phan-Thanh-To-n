package casestudy.services.Impl;

import casestudy.models.Customer;
import casestudy.models.Facility;
import casestudy.models.Villa;
import casestudy.services.FacilityService;
import casestudy.utils.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static final String REGEX_STR ="[A-z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]!([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^[3-9]\\d[1-9]\\d{2,})$";

    public static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    //interger soos luowng dc thue
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
    for (Map.Entry<Facility, Integer> element: facilityIntegerMap.entrySet()){
        System.out.println("Service " + element.getKey() + "So lan da thuc hien: " + element.getValue());
    }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        String service = scanner.nextLine();
//        System.out.println("Nhap dich vu: ");
//        String service = scanner.nextLine();
        System.out.println("Nhap phong da thue ");
        Double usedArea= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap gia cho thue ");
        Double rentPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap loai tien: ");
        String rentType = scanner.nextLine();
        System.out.println("Nhap tieu chuan phong: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Mo ta tien ich: ");
        String utilityDescription = scanner.nextLine();
        System.out.println("Nhap dien tich ho boi: ");
        Double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so tang: ");
        int floors = Integer.parseInt(inputTotalPay());
        Villa villa = new Villa(id, service, usedArea, rentPrice, rentType, roomStandard,utilityDescription, poolArea, floors);
        //int id, String service, double usedArea, double rentPrice, String rentType, String roomStandard, String utilityDescription, double poolArea, int floor
        facilityIntegerMap.put(villa, 0);
        System.out.println("Them thanh cong");
    }
    private String inputName(){
        System.out.println("Nhap ten dich vu: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Ban da nhap sai dinh dang, ten dich vu phai viet hoa chu cai dau");
    }
    private String inputArea(){
        System.out.println("Nhap dien tich: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Ban da nhap sai dinh dang, dien tich phai lon hon 30");
    }
    private String inputTotalPay(){
        System.out.println("Nhap dien tich: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Ban da nhap sai dinh dang, so tien phai la so duong");
    }


    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
}
