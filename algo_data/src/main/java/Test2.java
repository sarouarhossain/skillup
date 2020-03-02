class Parents {
  Parents(String s) {
    System.out.println("hello from parents " + s);
  }
}

class Childs extends Parents {
  Childs() {
    super("Test");
  }

  Childs(int x) {
    this();
    System.out.println("hello from childs " + x);
  }
}

public class Test2 {
  public static void main(String[] args) {
    Childs obj = new Childs(5);
  }
}
