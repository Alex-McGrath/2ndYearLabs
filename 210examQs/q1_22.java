public class q1_22 {
    public static void main(String[] args) {
      int lcm = 1;
      for (int i = 2; i <= 20; i++) {
        lcm = lcm(lcm, i);
      }
      System.out.println(lcm);
    }

    public static int lcm(int a, int b) {
      return a * (b / gcd(a, b));
    }

    public static int gcd(int a, int b) {
      if (b == 0) {
        return a;
      }
      return gcd(b, a % b);
    }
  }
