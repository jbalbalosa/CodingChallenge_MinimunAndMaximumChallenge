import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Coding Challenge: Minimum and Maximum Challenge");
        System.out.println("-----------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        int minimum = 0;
        int maximum = 0;
        while(true){
            System.out.print("Enter number: ");
            boolean hasAnInt = scanner.hasNextInt();
            if(hasAnInt){
                int number = scanner.nextInt();
                if(minimum == 0 && maximum == 0) {
                    minimum = number;
                    maximum = number;
                } else if(number < minimum) {
                    minimum = number;
                } else if(number > maximum){
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