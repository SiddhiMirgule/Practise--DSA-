package com.siddhi;

import java.util.Arrays;

class Solution {
    public double[] internalAngles(int[] sides) {
        int a = sides[0], b = sides[1], c = sides[2];

        if (a + b <= c || b + c <= a || a + c <= b) {
            return new double[0];
        }

        double A = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2.0 * b * c)));
        double B = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2.0 * a * c)));
        double C = Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2.0 * a * b)));

        double[] result = {A, B, C};
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] sides = {3, 4, 5};

        Solution obj = new Solution();  // ✅ object created
        double[] angles = obj.internalAngles(sides);

        if (angles.length == 0) {
            System.out.println("[]");
        } else {
            for (double angle : angles) {
                System.out.printf("%.5f ", angle);
            }
        }
    }
}