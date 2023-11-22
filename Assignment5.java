import java.util.Scanner;
class Assignment5 {
   public static void main(String[] args) {
    //คำนวณหาค่าดัชนีมวลกายและประเมินว่าอยู่ในระดับใด
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Input your Weight(kg):");
    float weight=sc.nextFloat();
    System.out.print("Input your Height(cm):");
    float height=sc.nextFloat();
    
    height/=100;
    float bmi=weight/(height*height);
    
    System.out.println("BMI = "+bmi);
    
    String predict="";
    
    if(bmi<18){
        predict="Below";
    }
    else if(bmi>=18){
        predict="Slim";
    }
    else if(bmi>=23){
        predict="Overweight";
    }
    else if(bmi>=25){
        predict="Obesity";
    }
    else if(bmi>=30){
        predict="Dangerous";
    }
    
    System.out.println("Predict results: "+predict);

   } 
}
