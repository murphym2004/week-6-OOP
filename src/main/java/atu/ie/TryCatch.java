package atu.ie;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("please enter a number between 0 and 9");


        try (Scanner myscan = new Scanner(System.in)) {
            int mynum = -1;
            while (mynum < 0 || mynum > 9) {
                String input = myscan.nextLine();
                try {
                    mynum = Integer.parseInt(input);
                    if (mynum >= 0 && mynum <= 9) {
                        System.out.println("the number is " + mynum);
                    } else {
                        System.out.println("invalid number");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("invalid number " + e.getMessage());
                }
            }

        }
    }
}
