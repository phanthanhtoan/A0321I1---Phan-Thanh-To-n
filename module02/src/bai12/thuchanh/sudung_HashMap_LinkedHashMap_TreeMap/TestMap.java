package bai12.thuchanh.sudung_HashMap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //Tạo HashMap trong main để lưu danh sách sinh viên
        Map<String, Integer> haspMap = new HashMap<>();
        haspMap.put("Smith",30);
        haspMap.put("Anderson",31);
        haspMap.put("Lewis",29);
        haspMap.put("Cook",29);
        System.out.println("Display entries in HaspMap");
        System.out.println(haspMap +"\n");

        //Tạo TreeMap trong main để lưu key theo thứ tự giảm dần
        Map<String, Integer> treeMap = new TreeMap<>(haspMap);
        System.out.println("Display entries in ascendingoder of key");
        System.out.println(treeMap);

        //Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Cook",29);
        System.out.println("\nThe age for "+"Lewis is " +linkedHashMap.get("Lewis"));
    }
}
