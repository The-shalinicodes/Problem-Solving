class Solution {
  public int countElements(int[] arr) {
    // Your code goes here
    Set<Integer> set = new HashSet<>();
    int count = 0;

    for (int num : arr) {
      set.add(num);
    }
    for (int num : arr) {
      if (set.contains(num + 1)) {
        count++;
      }
    }
    return count;
  }
}
