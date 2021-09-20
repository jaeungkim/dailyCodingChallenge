public class jaeSolution {
    public static void main(String[] args) {
        //hashmap solutions
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        for (int n : nums1) {
            m1.put(n, m1.getOrDefault(n, 0) + 1);
        }

        int cnt = 0;
        for (int n : nums2) {
            if (m1.containsKey(n)) {
                m2.put(n, m2.getOrDefault(n, 0) + 1);
                cnt++;
                m1.put(n, m1.get(n) - 1);
                if (m1.get(n) == 0)
                    m1.remove(n);
            }
        }
        int[] res = new int[cnt];
        int idx = 0;
        for (int n : m2.keySet()) {
            for (int i = 0; i < m2.get(n); i++) {
                res[idx++] = n;
            }
        }
        return res;
    }
}
