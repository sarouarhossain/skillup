package data_st.array_a;

public class SparseArray {
  private String[] strings = {"aba", "baba", "aba", "xzxb"};
  private String[] queries = {"aba", "xzxb", "ab"};

  public int[] matchingStrings() {
    int[] res = new int[queries.length];
    int index = 0;
    for (String st : queries) {
      res[index++] = countQueryString(strings, st);
    }

    return res;
  }

  public int countQueryString(String[] strings, String qString) {
    int counter = 0;
    for (String s : strings) {
      if (s.equals(qString)) {
        counter++;
      }
    }
    return counter;
  }
}
