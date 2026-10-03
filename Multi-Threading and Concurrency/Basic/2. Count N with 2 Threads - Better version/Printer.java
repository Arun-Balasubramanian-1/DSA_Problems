class Printer implements Runnable {

    private final SimpleCounter simpleCounter;
    private final int threadId;

    public Printer(SimpleCounter simpleCounter, int threadId) {
        this.simpleCounter = simpleCounter;
        this.threadId = threadId;
    }

    @Override
    public void run(){
        while(true) {
            synchronized (simpleCounter){
                while (simpleCounter.getCounter() % 2 != threadId) {
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