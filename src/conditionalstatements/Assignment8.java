package conditionalstatements;
/*Write a program to print the color name, based on color code.
If color code in not valid then print "Invalid Code".
 R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.*/


public class Assignment8 {
    public static void main(String[] args) {
        char colorCode = 'Q';

        switch (colorCode) {
            case 'R':
                System.out.println("R->Red");
                break;
            case 'G':
                System.out.println("G->Green");
                break;
            case 'B':
                System.out.println("B->Blue");
                break;
            case 'O':
                System.out.println("O->Orange");
                break;
            case 'Y':
                System.out.println("Y->Yellow");
                break;
            case 'W':
                System.out.println("W->White");
                break;
            default:
                System.out.println("Invalid Code");
        }

    }
}
