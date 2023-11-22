class LogicTutorial {
   public static void main(String[] args) {
        /*
        AND
        ถ้าเป็น true && true จะเท่ากับ true
        ถ้า true && false จะเท่ากับ false
        สรุป ถ้าฝั่งใดเป็น false จะเท่ากับ false ทั้งหมด
        OR
        ถ้าเป็น true || true จะเท่ากับ true
        ถ้า true || false จะเท่ากับ true
        ถ้า false || false จะเท่ากับ false
        สรุป ถ้าฝั่งใดฝั่งหนึ่งเป็น true หรือ false จะเท่ากับ true เสมอยกเว้น false หรือ false  
        NOT 
        คือ เป็นการเปลี่ยนค่า ถ้ามีค่าเป็น true จะเปลี่ยนค่าเป็น false
        หรือ เป็น false จะเปลี่ยนค่าเป็น true
        */
        int a=10,b=20;
        boolean c=(a==b);
        boolean d=(a<b);
        System.out.println(c&&d);//false && true = false
        System.out.println(c||d);//false || true = true
        System.out.println(!(c||d));//NOT

        
   } 
}
