import java.util.HashMap;

class Solution {
  public static char mostFrequentChar(String s) {
    HashMap<Character, Integer> mp = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      Integer val = mp.get(c);
      if (val != null) {
        mp.put(c, val + 1);
      } else {
        mp.put(c, 1);
      }
    }
    char ans = 'a';
    int mx = -1;
    for (int i = 0; i < s.length(); ++i) {
      if (mp.get(s.charAt(i)) > mx) {
        mx = mp.get(s.charAt(i));
        ans = s.charAt(i);
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    // Try out your test cases:
    System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
    System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
    System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
    System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'

  }

}
