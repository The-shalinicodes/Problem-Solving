class Solution {
  public int rowWithMax1s(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;

    int count_max = 0;
    int index = -1;

    for (int i = 0; i < n; i++) {
      int count_ones = 0;
      for (int j = 0; j < m; j++) {
        count_ones += mat[i][j];
      }
      if (count_ones > count_max) {
        count_max = count_ones;
        index = i;
      }
    }
    return index;
  }
}
