import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Coding Challenge: Minimum and Maximum Challenge");

        Scanner scanner = new Scanner(System.in);

        int minimum = 0;
        int maximum = 0;
        while(true){
            System.out.println("Enter number: ");
            boolean hasAnInt = scanner.hasNextInt();
            if(hasAnInt){
                int number = scanner.nextInt();
                if(minimum == 0 ) {
                    minimum = number;
                } else if(minimum > number) {
                    minimum = number;
                } else if(minimum < number){
                    maximum = number;
                }
            } else{
                break;
            }
        }

        System.out.println("Minimum number: " + minimum + ", Maximum number: " + maximum);
        scanner.close();
    }
}