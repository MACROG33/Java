import java.util.Scanner;
class Assignment3 {
    public static void main(String[] args) {
        //เขียนโปรแกรมหาเลขคู่ / เลขคี่
        Scanner kb=new Scanner(System.in);
        System.out.print("Input Number: ");
        int number=kb.nextInt();
        String result="";
        if(number%2==0){
            result=number+" = EVEN";
        }
        else{
            result=number+" = ODD";
        }
        System.out.println(result);
    }
}
