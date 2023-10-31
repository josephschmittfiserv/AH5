import java.util.HashMap;

import javax.xml.transform.Source;

class Solution {
  public static char mostFrequentChar(String s) {

    HashMap<Character, Integer> mp = new HashMap<>();

    char ans = 0;

    int cnt = 0;

    for (int i = 0; i < s.length(); i++) {

      char c = s.charAt(i);
      mp.put(c, mp.getOrDefault(c, 0) + 1);

      // Use less then or equal to because last value will always 
      //technically be the first value which is the criteria.
      if (cnt <= mp.get(c)) {
        System.out.println(c);
        ans = c;
        cnt = mp.get(c);
      }
    }

    return ans;
  }

  public static void main(String[] args) {

    System.out.println(mostFrequentChar("bookeeper")); // -> 'e'

    System.out.println(mostFrequentChar("david")); // -> 'd'

    System.out.println(mostFrequentChar("mississippi")); // -> 'i'

    System.out.println(mostFrequentChar("eleventennine")); // -> 'e'

  }

}
