package code;

public class Primate {

    public static void main(String[] args) {
        getTreAngle(7);
    }

    public static void getTreAngle(int number){

        for (int i = number; i >0 ; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }





    }
}
