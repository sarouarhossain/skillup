package data_st.array_a;

public class LeftRotation {
  int[] a = {1, 2, 3, 4, 5};

  public void rotation(int t) {
    int[] res = new int[a.length];
    int x = 0;
    for (int i = t; i < a.length; i++) {
      res[x++] = a[i];
    }

    for (int j = 0; j < t; j++) {
      res[x++] = a[j];
    }

    for (int k : res) {
      System.out.println(k);
    }
  }
}
