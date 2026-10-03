
class Main {
    public static void main(String args[]){
        SimpleCounter simpleCounter = new SimpleCounter(10);
        Thread thread1 = new Thread(new Printer(simpleCounter, 1), "Odd Printer");
        Thread thread2 = new Thread(new Printer(simpleCounter, 0), "Even Printer");
        thread1.start();
        thread2.start();
    }
}