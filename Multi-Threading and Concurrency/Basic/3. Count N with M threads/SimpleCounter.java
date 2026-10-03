class SimpleCounter {
    
    private int counter = 1;
    private final int MAX_VALUE;

    public SimpleCounter(int maxValue) {
        this.MAX_VALUE = maxValue;
    }

    public int getCounter(){
        return counter;
    }

    public int getMaxValue(){
        return MAX_VALUE;
    }

    public void printCounter(){
        System.out.println(counter + " is printed by " + Thread.currentThread().getName());
        counter++;
    }
    
}