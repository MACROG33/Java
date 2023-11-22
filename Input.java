import java.util.Scanner;
class Input{
    public static void main(String[] args) {
        //input
        // integer,float,long,double,string
        
        Scanner sc=new Scanner(System.in);//ประการการใช้คำสั่ง Sc
        System.out.print("Input your Name: ");//ข้อความแสดงการรับค่าข้อมูล
        String name=sc.nextLine();//รับค่าข้อมูล

        System.out.print("Input year:");//ข้อความแสดงการรับค่าข้อมูล
        int year=sc.nextInt();//รับค่าข้อมูล

        int age;//คำนวณอายุ
        age=2566-year;
        
        System.out.println("Your name is:"+name);
        System.out.println("Your year is:"+year);
        System.out.println("Your age is:"+age);
    }
}