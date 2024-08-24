import java.util.Scanner;

public class nestedIfElse {

    public static void main(String a[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number");

        int num=scanner.nextInt();

        if(num>=10 && num<=40){
            System.out.print("C");
        }

        else if(num>=41 && num<=70){
            System.out.print("B");
        }

        else{
            System.out.print("A");
        }
    }

}
