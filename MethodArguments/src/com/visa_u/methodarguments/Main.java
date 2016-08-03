package com.visa_u.methodarguments;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> textNums = new ArrayList<String>();

    public static void main(String[] args) {
        textNums.add("zero");
        textNums.add("one");
        textNums.add("two");
        textNums.add("three");
        textNums.add("four");
        textNums.add("five");
        textNums.add("six");
        textNums.add("seven");
        textNums.add("eight");
        textNums.add("nine");
        textNums.add("ten");

        System.out.println(addUp(3.2, 2.2));
        System.out.println(addUp(1, 4));
        System.out.println(addUp("one", "three")); //Calls 'int addUp'
        System.out.println(addUp(2, 3.5));
        //addUp(1, "three");  ## Doesn't compile because no signature matches addUp(int, String)
    }

    public static int addUp(int... list) {
        System.out.print("int addUp result: ");
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }

    public static double addUp(double... list) {
        System.out.print("double addUp result: ");
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }

    public static int addUp(String... list) {
        System.out.print("String addUp result: ");
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += Main.toNum(list[i]);
        }
        return sum;
    }

    public static int toNum(String str) {
        return textNums.indexOf(str);
    }

    /** Lab1 Work
    public static int addUp(int a, int b) {
        System.out.print("int addUp result: ");
        return a + b;
    }

    public static double addUp(double a,double  b) {
        System.out.print("double addUp result: ");
        return a + b;
    }

    public static int addUp(String a, String b) {
        System.out.print("String addUp result: ");
        return addUp(Main.toNum(a), Main.toNum(b));
    }

    public static int toNum(String str) {
        return textNums.indexOf(str);
    }
    **/






    //{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

}
