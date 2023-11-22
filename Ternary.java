import java.util.Scanner;
class Ternary {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Input Number: ");
        int number=kb.nextInt();
        String result="";
        //ternary 
        result = (number%2==0) ? number+" = EVEN":number+" = ODD";
        System.out.println(result);
    }
}
