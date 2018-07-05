package com.company.TribonacciSequence;

public class Task {

    public static void main(String[] args) {


    }



    public double[] xbonacci(double[] signature, int n) {
        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            if (i < signature.length) {
                result[i] = signature[i];
            } else {
                for (int j = 1; j <= signature.length; j++) {
                    result[i] += result[i - j];
                }
            }
        }
        return result;
    }
}

