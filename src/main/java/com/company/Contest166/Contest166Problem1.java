package com.company.Contest166;

public class Contest166Problem1 {
    public int subtractProductAndSum(int n) {
        double product = 1;
        double sum = 0;

        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n = n / 10;
        }

        return (int)(product - sum);
    }
}
