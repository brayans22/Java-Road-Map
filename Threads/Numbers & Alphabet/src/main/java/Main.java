public class Main {
    public static void main(String[] args) {
        ThreadCase threadNumber = new ThreadCase(1);
        ThreadCase threadAlphabet = new ThreadCase(2);

        threadNumber.run();
        threadAlphabet.run();
    }
}