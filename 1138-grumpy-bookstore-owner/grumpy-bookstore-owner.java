class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int satisfied = 0;
        int maxSatisfied = 0;

        for (int i = 0; i < n; i++) {
           if(grumpy[i] == 0) satisfied += customers[i];
        }

        int windowStart = 0;
        int windowEnd = 0;
        int grumpyCustomers = 0;

        while (windowEnd < n) {
            
            if (grumpy[windowEnd] == 1)  grumpyCustomers += customers[windowEnd];

            if (windowEnd - windowStart + 1 > minutes) {                                       // invalid
                if (grumpy[windowStart] == 1)
                    grumpyCustomers -= customers[windowStart];
                windowStart++;
            }

            maxSatisfied = Math.max(maxSatisfied, satisfied + grumpyCustomers);
            windowEnd++;
        }

        return maxSatisfied;
    }
}
