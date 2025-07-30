import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        int a = year % 19;
        int b = year % 4;
        int c = year % 7;

        int M = 0, N = 0;

        if (year >= 1583 && year <= 1699) {
            M = 22; N = 2;
        } else if (year <= 1799) {
            M = 23; N = 3;
        } else if (year <= 1899) {
            M = 23; N = 4;
        } else if (year <= 2099) {
            M = 24; N = 5;
        } else if (year <= 2199) {
            M = 24; N = 6;
        } else if (year <= 2299) {
            M = 25; N = 0;
        }

        int d = (19 * a + M) % 30;
        int e = (2 * b + 4 * c + 6 * d + N) % 7;

        int day = 0;
        String month = "";

        if (d + e < 10) {
            day = d + e + 22;
            month = "March";
        } else {
            day = d + e - 9;
            month = "April";
        }

        if (day == 26 && month.equals("April")) {
            day = 19;
        } else if (day == 25 && month.equals("April") && d == 28 && e == 6 && a == 10) {
            day = 18;
        }

        String suffix = getOrdinalSuffix(day);

        System.out.println("In " + year + " the Festival is on " + month + " " + day + suffix);
    }

    private static String getOrdinalSuffix(int day) {
        if (day >= 11 && day <= 13) {
            return "th";
        }
        switch (day % 10) {
            case 1: return "st";
            case 2: return "nd";
            case 3: return "rd";
            default: return "th";
        }
    }
}
