import java.util.Scanner;
class IfStatement {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Input your age: ");
        int age=kb.nextInt();
        
        if(age>=15){
            System.out.println("Mr/Ms");
        }
        else{
            System.out.println("DekChai/Dekyuang");
        }
    }
            
    
}
