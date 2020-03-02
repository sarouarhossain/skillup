package exception;

public class Test {
    public static void main(String[] a){
        Helper helper = new Helper();
        helper.doStaff();
    }
}

class Helper {
    public void doStaff(){
        doMoreStuff();
    }

    public void doMoreStuff(){
        // default exception handler
        try {
            System.out.println(10/2);
        }catch (ArithmeticException e){
            System.out.println("Exception occured");
        }finally {
            System.out.println("Finally do stuff");
        }
    }
}
