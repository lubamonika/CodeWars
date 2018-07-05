package com.company.RoboticTotooRemoval;

import java.util.Arrays;
import java.util.stream.Collector;

public class RoboticTatooRemoval {

    public static String[][] robot(String[][] skinScan) {
        for (int i = 0; i < skinScan.length; i++) {
            for (int j = 0; j < skinScan[i].length; j++) {
                if (skinScan[i][j] == "X") {
                    skinScan[i][j] = "*";
                }
            }
        }
      return skinScan;
    }
}

/*

public class RoboticTattooRemoval {
    public static String[][] robot(String[][] skinScan) {
        return Arrays
              .stream(skinScan)
              .map(x -> Arrays.stream(x).map(y -> y.equals("X") ? "*" : y).toArray(i -> new String[i]))
              .toArray(i -> new String[i][i]);
    };
 */