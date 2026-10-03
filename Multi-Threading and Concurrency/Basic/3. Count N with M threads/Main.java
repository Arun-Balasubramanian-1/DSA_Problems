
import java.util.ArrayList;
import java.util.List;


class Main {
    public static void main(String args[]){
        int maxCount = 14;
        int threadsCount = 3;

        SimpleCounter simpleCounter = new SimpleCounter(maxCount);

        List<Thread> threadList = new ArrayList<>();
        for(int i=1; i <= threadsCount; i++){
            threadList.add(new Thread(new Printer(simpleCounter, i, threadsCount), "Thread - " + i));
        }

        for(int i=0; i <threadsCount; i++){
            threadList.get(i).start();
        }
    }
}