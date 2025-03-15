class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    } 
    
    // Yha pr hmne method overload kiya hai jisme method ka naam same hai but usme parameters alg hai to it will work fine
    public int add(int n1, int n2, int n3) {
        return n1 + n2+n3;
    } 
}

// Main class hmesha file name se match kregi

public class overloading {
    public static void main(String[] args) {
        Calc obj = new Calc();  
        int res = obj.add(5, 1);
        int res2=obj.add(1,1,1);

        System.out.println(res); 
        System.out.println(res2);  
    }
}
