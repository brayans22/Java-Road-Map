public class Counter implements Runnable {

    private int counter;
    private int limit;
    private String name;

    public Counter(int limit, String name) {
        this.counter = 0;
        this.limit = limit;
        this.name = name;
    }
    @Override
    public void run()
    {
        while (this.counter <= this.limit)
        {
            System.out.println("Thread Name: " + this.name + " | Counter: " + this.counter);
            this.counter++;
        }
        System.out.println("Thread Name: " + this.name + " FINISH");
    }

}
