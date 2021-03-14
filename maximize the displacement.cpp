class Solution {
   public:
   int solve(string s) {
      int op = 0;
      int l = 0;
      int r = 0;
      for (auto &it : s) {
         if (it == 'L') {
            l++;
         } else if (it == 'R') {
            r++;
         } else {
            op++;
         }
      }
      return max(l, r) - min(l, r) + op;
   }
}
