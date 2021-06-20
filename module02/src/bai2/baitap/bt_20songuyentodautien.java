package bai2.baitap;

public class bt_20songuyentodautien {

    public static void main(String[] args) {
        int count=0, n=2;
        while (count<20){
            boolean check = true;
            for (int i=2; i<=Math.sqrt(n); i++){
                if (n%i==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
    }
}



