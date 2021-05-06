package code.int_;

public class ArmstrongExample {
    public static void main(String[] args) {
        armstrongNumber(153);
    }

    public static void armstrongNumber(int number){
        int result=0;
        int remand=0;
        int temp=number;

        while (number>0){
            remand=number%10;
            result+=(remand*remand*remand);
            number=number/10;

        }

        if(temp==result){
            System.out.println(temp+ " is armstrong number");
        }else {
            System.out.println(temp + " is not armstrong number");
            System.out.println(result);
        }
    }
}
