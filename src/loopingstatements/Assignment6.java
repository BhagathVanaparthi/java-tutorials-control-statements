package loopingstatements;
/*Write a program to add all the values in a given number and print. Ex: 1234->10*/


public class Assignment6 {
    public static void main(String[] args) {
        int number = 1234;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println(sum);

    }
}
