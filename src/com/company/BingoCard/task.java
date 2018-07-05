package com.company.BingoCard;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class task {

    public static void main(String[] args) {

        //getCard();
        for (String s: getCard2()
             ) {
            System.out.println(s);
        }

    }

    public static String[] getCard() {
        Random genertorGenerator = new Random();
        List<String> numbers = new ArrayList<>();
        Set<String> bingoCardB = new HashSet<>();
        Set<String> bingoCardI = new HashSet<>();
        Set<String> bingoCardN = new HashSet<>();
        Set<String> bingoCardG = new HashSet<>();
        Set<String> bingoCardO = new HashSet<>();
        for (int i=1; i<76; i++){
            numbers.add(String.valueOf(i));
        }
        while (bingoCardB.size() <=4 ) {
            int random = genertorGenerator.nextInt(14);
            bingoCardB.add("B"+numbers.get(random));
        }
        while (bingoCardI.size() <=4 ) {
            int random = genertorGenerator.nextInt(15) + 15;
            bingoCardI.add("I"+numbers.get(random));
        }
        while (bingoCardN.size() <=3 ) {
            int random = genertorGenerator.nextInt(15) + 30;
            bingoCardN.add("N"+numbers.get(random));
        }
        while (bingoCardG.size() <=4 ) {
            int random = genertorGenerator.nextInt(15) + 45;
            bingoCardG.add("G"+numbers.get(random));
        }
        while (bingoCardO.size() <=4 ) {
            int random = genertorGenerator.nextInt(15) + 60;
            bingoCardO.add("O"+numbers.get(random));
        }

        List<String> output = new ArrayList();
        output.addAll(bingoCardB);
        output.addAll(bingoCardI);
        output.addAll(bingoCardN);
        output.addAll(bingoCardG);
        output.addAll(bingoCardO);

        String[] outputStr = new String[output.size()];
        System.out.println(output);
        return outputStr = output.toArray(outputStr);

    }

    public static String[] getCard2() {
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            ThreadLocalRandom.current().ints(1 + i * 15, 16 + i * 15).distinct().limit(i != 2 ? 5 : 4).forEach(ints::add);
        String[] ret = new String[24];
        for (int i = 0; i < 24; i++)
            ret[i] = "BBBBBIIIIINNNNGGGGGOOOOO".charAt(i) + "" + ints.get(i);
        return ret;
    }
}


        //5 numbers from the B column in the range 1 to 15
        //5 numbers from the I column in the range 16 to 30
       // 4 numbers from the N column in the range 31 to 45
       // 5 numbers from the G column in the range 46 to 60
        //5 numbers from the O column in the range 61 to 75