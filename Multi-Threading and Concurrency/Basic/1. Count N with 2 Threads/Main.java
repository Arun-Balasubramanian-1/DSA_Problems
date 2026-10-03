
class Main {
    public static void main(String args[]){
        SimpleCounter simpleCounter = new SimpleCounter(10);
        Thread thread1 = new Thread(new OddPrinter(simpleCounter), "Odd Printer");
        Thread thread2 = new Thread(new EvenPrinter(simpleCounter), "Even Printer");
        thread1.start();
        thread2.start();
    }
}