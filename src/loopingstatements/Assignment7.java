package loopingstatements;
/*Write a program to print * in Floyds format (using for and while loop) **/


public class Assignment7 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            System.exit(0);
        }

        int rowCount = Integer.parseInt(args[0]);

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
