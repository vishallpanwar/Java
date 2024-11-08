/* import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // String with spaces nhi output dega
        String name=sc.next();

        // String with spaces nhi output dega
        String name=sc.nextLine();

        System.out.println(name);
    }
} */

// Ques : take 2 variables an print their sum

import java.util.*;
class input{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // nextInt() integer ko input lene ke liye
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println(num1+num2);
    }
}