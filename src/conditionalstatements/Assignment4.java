package conditionalstatements;
/*Initialize two character variables in a program and display the characters in alphabetical order.
 Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and second is e O/P:a,e*/


public class Assignment4 {
    public static void main(String[] args) {
        char x = 'a';
        char y = 'e';

        if (x < y) {
            System.out.println(x + ", " + y);
        } else {
            System.out.println(y + ", " + x);
        }

    }
}
