import java.util.Scanner;
class Assignment6 {
    public static void main(String[] args) {
        //โปรแกรมแลกธนบัตร ==> 1000 , 500 , 100 , 50 , 20
        Scanner kb=new Scanner(System.in);
        System.out.print("Money: ");
        int money=kb.nextInt();
        
        System.out.println("=====================================");
        
        if(money>=1000){
            System.out.println("1000 bath = "+(money/1000)+" Tickets");
            money%=1000;
            
        }
        if(money>=500){
            System.out.println("500 bath = "+(money/500)+" Tickets");
            money%=500;
            
        }
        if(money>=100){
            System.out.println("100 bath = "+(money/100)+" Tickets");
            money%=100;
            
        }
        if(money>=50){
            System.out.println("50 bath = "+(money/50)+" Tickets");
            money%=50;
            
        }
        if(money>=20){
            System.out.println("20 bath = "+(money/20)+" Tickets");
            money%=20;
            
        }
        if(money>=10){
            System.out.println("10 bath = "+(money/10)+" Coin");
            money%=10;
        }


    }
}
