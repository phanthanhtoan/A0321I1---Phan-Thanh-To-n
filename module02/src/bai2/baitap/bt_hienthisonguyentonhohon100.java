package bai2.baitap;

public class bt_hienthisonguyentonhohon100 {
    public static void main(String[] args) {
//        int n=2;
//        while (n<100){
//            boolean check = true;
//            for (int i=2; i<=Math.sqrt(n); i++){
//                if (n%i==0){
//                    check = false;
//                    break;
//                }
//            }
//            if (check){
//                System.out.print (n+" ");
//            }
//            n++;
//        }
        for (int num=1; num<100; ++num){
            int count =0;
            for (int i=2; i<Math.sqrt(num);i++){
                if (num%i==0){
                    count++;
                }
            }
            if (count==0 &&num>1){
                System.out.print(" "+num);
            }
        }
    }
}
