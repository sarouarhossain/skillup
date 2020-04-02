package learn_exception;

public class Test2 {
    public static void main(String[] args) throws Exception{
        Test2 test2 = new Test2();
        test2.doStuff();
    }

    public void doStuff() throws Exception{
        doMoreStuff();
    }

    public void doMoreStuff() throws Exception{
        int x = 5/0;
        System.out.println(x);
    }
}
