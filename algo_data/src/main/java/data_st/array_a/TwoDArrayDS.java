package data_st.array_a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoDArrayDS {

  public void test() {
    System.out.println("Testing ");

    int[][] arr_t = {
      {1, 1, 1, 0, 0, 0},
      {0, 1, 0, 0, 0, 0},
      {1, 1, 1, 0, 0, 0},
      {0, 0, 2, 4, 4, 0},
      {0, 0, 0, 2, 0, 0},
      {0, 0, 1, 2, 4, 0}
    };

    System.out.println("Result: " + this.findResult(arr_t));
  }

  private int findResult(int[][] arr) {
    List<Integer> results = new ArrayList<>();

    for (int i = 0; i <= 3; i++) {
      for (int j = 0; j <= 3; j++) {

        int x = 0, y = 0;
        int[][] a = new int[3][3];

        for (int m = i; m <= i + 2; m++) {
          for (int n = j; n <= j + 2; n++) {
            a[x][y++] = arr[m][n];
          }
          x++;
          y = 0;
        }

        results.add(this.calculateArraySum(a));
      }
    }

    return Collections.max(results);
  }

  private int calculateArraySum(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if ((i == 1 && j == 0) || (i == 1 && j == 2)) {
          sum += 0;
        } else {
          sum += arr[i][j];
        }
      }
    }

    return sum;
  }
}
