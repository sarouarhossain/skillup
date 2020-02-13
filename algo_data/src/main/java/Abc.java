public class Abc {

  public void test() {
    System.out.println("Haaa" + getX());
  }

  private int getX() {
    return getY();
  }

  private int getY() {
    return 20;
  }
}
