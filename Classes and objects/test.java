// This is a class
class Demo {
    
    int a;
    public int add(){
        System.out.println("Added");
        return 0;
    }
}

// Add function ko dusri class me chlane ke liye hmko constructor ka use krna pdega

public class test{
    public static void main(String[] args) {
        
        // Initializing the object
        Demo one=new Demo();

        // And then using the methods
        one.add();

        // Also, we can
        int result=one.add();
        System.out.println(result);
    }
}