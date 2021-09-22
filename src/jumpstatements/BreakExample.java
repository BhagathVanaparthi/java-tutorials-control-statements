package jumpstatements;

public class BreakExample {
    public static void main(String[] args) {
// Using for loop.
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break; //  Breaking a loop.
            System.out.println("I: " + i);
        }
    }
}
