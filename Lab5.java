public class Lab5 {
    void add(int a, int b){
        System.out.println("addition of two integer values is "+(a+b));
    }
    void add(Double a, Double b){
        System.out.println("addition of two double values is "+(a+b));
    }
    void add(int a, int b, int c){
        System.out.println("addition of three integer values is "+(a+b+c));
    }
    public static void main(String[] args) {
        Lab5 ob = new Lab5();
        ob.add(2, 3);
        ob.add(2.0, 3.0);
        ob.add(2, 3, 4);
        
    }
}
