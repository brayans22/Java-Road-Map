public class ThreadCase implements Runnable{
    
    private int type;
    private static final int CASE_ONE_HUNDRED = 1;
    private static final int CASE_ALPHABET = 2;
    
    ThreadCase(int type) { this.type = type; }
    
    @Override
    public void run() {
        while (true) {
            switch (type){
                case CASE_ONE_HUNDRED:
                    for (int i = 1; i <= 100; i++)
                        System.out.println(i);
                case CASE_ALPHABET:
                    for (int i = 'a'; i <= 'z'; i++)
                        System.out.println(i);
                default:
                    System.out.println("Nothing");
            }
        }
    }
}

