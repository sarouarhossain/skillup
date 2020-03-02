package data_st.recursion;

public class RecursiveDigitSum {
  public static int superDigit(String n, int k) {

    String x = sup1(n);

    Integer temp = Integer.parseInt(x);
    Integer v = temp * k;

    String res = sup1(v.toString());

    return Integer.parseInt(res);
  }

  static String sup1(String n) {
    if (n.length() == 1) return n;

    Integer temp = 0;
    for (int i = 0; i < n.length(); i++) {
      temp += Character.getNumericValue(n.charAt(i));
    }

    return sup1(temp.toString());
  }
}
