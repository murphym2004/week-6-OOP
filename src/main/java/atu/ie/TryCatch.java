package atu.ie;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("please enter a number between 0 and 9");
        Scanner myscan = new Scanner(System.in);

        String input = myscan.nextLine();
        int mynum = Integer.parseInt(input);
        if(mynum >= 0 && mynum <= 9) {
            System.out.println(mynum);
        }
        else {
            System.out.println("invalid number");
        }
    }
}
