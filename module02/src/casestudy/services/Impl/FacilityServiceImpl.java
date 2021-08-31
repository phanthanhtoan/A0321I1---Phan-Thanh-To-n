package casestudy.services.Impl;

import casestudy.models.Customer;
import casestudy.models.Facility;
import casestudy.models.Villa;
import casestudy.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
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
        System.out.println("Nhap dich vu: ");
        String service = scanner.nextLine();
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
        int floors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(id, service, usedArea, rentPrice, rentType, roomStandard,utilityDescription, poolArea, floors);
        //int id, String service, double usedArea, double rentPrice, String rentType, String roomStandard, String utilityDescription, double poolArea, int floor
        facilityIntegerMap.put(villa, 0);
        System.out.println("Them thanh cong");
    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
}
