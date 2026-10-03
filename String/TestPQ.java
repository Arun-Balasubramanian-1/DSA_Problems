import java.util.PriorityQueue;
import java.util.Queue;

class TestPQ {
    public static void main(String[] args) {
        int[] arr = { 23, 18, 1, 5, 99, 77};

        Queue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);

        for(int element : arr){
            pq.add(element);
            System.err.println(pq);
        }

        for(int element : pq){
            System.out.println(element);
        }

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}