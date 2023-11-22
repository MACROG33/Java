import java.util.Scanner;
class Assignment2 {
    public static void main(String[] args) {
        //โปรแกรมเปรียบเทียบบตัวเลข
        Scanner kb=new Scanner(System.in);
        System.out.print("Number_1: ");
        int number1=kb.nextInt();
        System.out.print("Number_2: ");
        int number2=kb.nextInt();

        if(number1>number2){
            System.out.println(number1+" > "+number2);
        }
        else if(number1<number2){
            System.out.println(number1+" < "+number2);
        }
        else{
            System.out.println(number1+" = "+number2);
        }
    }
}
