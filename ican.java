public class ican {
    public static void main(String[] args){
        System.out.println(product(2,3));
        System.out.println(squaresum(2,3));
        warning();
    }
    static int product(int x, int y){
        return x + y;
    }
    static int squaresum(int x, int y){
        return x*x + y*y;
    }
    static void output(String content){
        System.out.println(content);
        System.out.println("");
    }
    static void warning(){
        System.out.println("WARNUNG");
        System.out.println();
    }
}