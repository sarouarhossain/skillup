class Parent {
  String s = "Parent";

  public void hello() {
    System.out.println("Hello from parent");
  }
}

class Child extends Parent {
  String s = "Child";

  public void hello() {
    System.out.println("Hello from child");
  }

  public void test() {
    System.out.println(s);
    System.out.println(this.s);
    System.out.println(super.s);
    hello();
    this.hello();
    super.hello();
  }
}

public class Test {
  public static void main(String[] args) {
    Child obj = new Child();
    obj.test();
  }
}
