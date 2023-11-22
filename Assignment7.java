import java.util.Scanner;
class Assignment7 {
    public static void main(String[] args) {
        //แปลงองศาฟาเรนไฺฮเป็นองศาเซลเซียส
        /*Scanner kb=new Scanner(System.in);
        System.out.print("Input temperature(F): ");
        float tempF=kb.nextFloat();

        float cel=(tempF-32)*5/9;
        System.out.println(tempF+" Fahrenheit = "+cel+" Celsius ");*/
        //แปลงองศาเซลเซียสเป็นองศาฟาเรนไฺฮ
        Scanner kb=new Scanner(System.in);
        System.out.print("Input temperature(C): ");
        float cel=kb.nextFloat();

        float tempF=(cel*9/5)+32;
        System.out.println(cel+" Celsius = "+tempF+" Fahrenheit ");
    }
}
