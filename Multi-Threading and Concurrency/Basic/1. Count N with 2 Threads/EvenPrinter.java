class EvenPrinter implements Runnable {

    private final SimpleCounter simpleCounter;

    public EvenPrinter(SimpleCounter simpleCounter) {
        this.simpleCounter = simpleCounter;
    }

    @Override
    public void run(){
        while(true) {
            synchronized (simpleCounter){
                if (simpleCounter.getCounter() % 2 != 0) {
                    try {
                        simpleCounter.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (simpleCounter.getCounter() > simpleCounter.getMaxValue()){
                    simpleCounter.notifyAll();
                    break;
                }
                simpleCounter.printCounter();
                simpleCounter.notifyAll();
            }
        }
    }
}