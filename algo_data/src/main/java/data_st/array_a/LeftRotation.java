package data_st.array_a;

public class LeftRotation {
  int[] arr = {1, 2, 3, 4, 5};

  public void rotation(int t) {
    int[] res = new int[arr.length];
    int x = 0;
    for (int i = t; i < arr.length; i++) {
      res[x++] = arr[i];
    }

    for (int j = 0; j < t; j++) {
      res[x++] = arr[j];
    }

    for (int k : res) {
      System.out.println(k);
    }
  }
}
