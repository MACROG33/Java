import java.util.Scanner;
class Nestedif {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Input your age: ");
        int age=kb.nextInt();
        //if ซ้อน if
        if(age<=15){
            System.out.println("M.ton");
            if(age==15){
                System.out.println("M.3");
            }
            else if(age==14){
                System.out.println("M.2");
            }
            else if(age==13){
                System.out.println("M.1");
            }
            else{
                System.out.println("Prathom");
            }
        }
        else{
            System.out.println("M.plai");
        }
    }
}
