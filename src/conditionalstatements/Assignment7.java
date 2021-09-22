package conditionalstatements;
/*Write a program to convert from upper case to lower case and vice versa of an alphabet and print
 the old character and new character as shown in example (Ex: a->A, M->m).*/


public class Assignment7 {
    public static void main(String[] args) {
        char ch = 'a';

        if (Character.isLowerCase(ch))
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        else
            System.out.println(ch + "->" + Character.toLowerCase(ch));

    }
}
