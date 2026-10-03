
class Printer implements Runnable {

    private final SimpleCounter simpleCounter;
    private final int threadId;
    private final int threadsCount;

    public Printer(SimpleCounter simpleCounter, int threadId, int threadsCount) {
        this.simpleCounter = simpleCounter;
        this.threadId = threadId;
        this.threadsCount = threadsCount;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (simpleCounter) {
                // System.out.println(isLastThread + " " + result + " " + threadId + " " + threadsCount + " " + Thread.currentThread().getName());
                while (true) {
                    int result = simpleCounter.getCounter() % threadsCount;
                    result = (result == 0) ? threadsCount : result;
                    if (result != threadId) {
                        try {
                            simpleCounter.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        break;
                    }

                }
                if (simpleCounter.getCounter() > simpleCounter.getMaxValue()) {
                    simpleCounter.notifyAll();
                    break;
                }
                simpleCounter.printCounter();
                simpleCounter.notifyAll();
            }
        }
    }
}
