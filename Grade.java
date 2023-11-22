import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
            System.out.print("Input your name: ");
            String name=sc.nextLine();
            System.out.print("Input your Grade: ");
            int score=sc.nextInt();
            if(score>=80){
                System.out.println("A");
            }
            else if(score>=70){
                System.out.println("B");
            }
            else if(score>=60){
                System.out.println("C");
            }
            else if(score>=50){
                System.out.println("D");
            }
            else{
                System.out.println("F");
            }
        
        
        
        
        
        
    }
}
