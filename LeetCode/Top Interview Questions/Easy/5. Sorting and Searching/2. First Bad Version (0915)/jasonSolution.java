/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1)
            return 1;
        int f = 1;
        int e = n;
        int m = 0;
        while(f < e){
            m = f + (e-f) / 2;
            if(isBadVersion(m))
                e = m;
            else 
                f = m+1;
        }
        return f;
    }
}
