package code;

public class StaticEx {
    static int a=5;

    static {
        System.out.println(a);
    }


}

class Test{
    public static void main(String[] args) {

        StaticEx staticEx=new StaticEx();

    //    System.out.println("StaticEx.a = " + StaticEx.a);
    }
}