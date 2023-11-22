import java.util.Scanner;
class Assignment1 {
   public static void main(String[] args) {
    //หาค่า BMI
      Scanner sc=new Scanner(System.in);
    //intput
    System.out.print("Input your Weight(kg):");
    float weight=sc.nextFloat();
    System.out.print("Input your Height(cm):");
    float height=sc.nextFloat();
    //process
    height/=100;
    float bmi=weight/(height*height);
    //output
    System.out.println("BMI = "+bmi);

   } 
}
