package bai11.baitap.Queue_dslkvong;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);


        queue.displayQueue();
        System.out.println("Hàng đợi: "+queue.dequeue());
        System.out.println("Hàng đợi sau khi xếp: ");
        queue.displayQueue();
    }
}
