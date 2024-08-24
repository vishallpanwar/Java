import java.util.Scanner;  // Import the Scanner class

public class iff {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        if(num>=18){
            System.out.print("Allowed");
        }

        else{
            System.out.print("Not allowed");
        }
    }
}
