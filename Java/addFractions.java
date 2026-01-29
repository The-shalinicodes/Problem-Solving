class Solution {
  int gcd(int x, int y) {
    if (y == 0) return x;
    return gcd(y, x % y);
  }

  public String addFractions(String frac1, String frac2) {
    // Your code goes here
    String[] f1 = frac1.split("/");
    int a = Integer.parseInt(f1[0]);
    int b = Integer.parseInt(f1[1]);

    String[] f2 = frac2.split("/");
    int c = Integer.parseInt(f2[0]);
    int d = Integer.parseInt(f2[1]);

    int num = (a * d) + (b * c);
    int den = (b * d);

    int g = gcd(num, den);
    num /= g;
    den /= g;
    return num + "/" + den;
    
  }
  
}
