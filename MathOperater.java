import java.util.Scanner;
class MathOperater{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //รับค่า ตัวเลขตัวที่ 1 และ 2
        System.out.print("InputNumber1: ");
        int a=sc.nextInt();
        System.out.print("InputNumber2: ");
        int b=sc.nextInt();
        //ตัวดำเนินการ บวก ลบ คูณ หาร หารเอาเศษ
        System.out.println("result+: "+(a+b));
        System.out.println("result-: "+(a-b));
        System.out.println("result*: "+(a*b));
        System.out.println("result/: "+(a/b));
        System.out.println("result%: "+(a%b));
        
    }
}