// Creating methods in class

class methods {
    public void music(){
        System.out.println("Baj raha hai");
    }   

    public int add(int a, int b){
        return a+b;
    }
}

// Calling methods inside another class by creating objects first

public class demo{
    public static void main(String[] args) {
        
        methods sample=new methods();
        sample.music();
        System.out.println(sample.add(5,5));
    }
}