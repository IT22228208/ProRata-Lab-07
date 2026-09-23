import java.util.Scanner;
 
public class IT22228208Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter marks for four subjects:");
        double total = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            total += scanner.nextDouble();
        }
 
        double average = total / 4;
        String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
 
        System.out.println("Average is : " + average);
        System.out.println("Overall Grade is : " + grade);
 
        scanner.close();
    }
}