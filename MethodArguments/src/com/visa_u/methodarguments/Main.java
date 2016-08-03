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

        //Variable length args tests
        //System.out.println(addUp()); ## Doesn't compile because no arguments match up to multiple methods
        System.out.println(addUp(1));
        System.out.println(addUp(1.5));
        System.out.println(addUp("three"));
        System.out.println(addUp(1, 5, 19));
        System.out.println(addUp(1.5, 6.3, 1));
        System.out.println(addUp("one", "one", "eight"));
        System.out.println(addUp(0, 0, 0));
        System.out.println(addUp(0.0, 0.0));
        System.out.println(addUp("zero", "zero", "zero"));
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
        int[] ints = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            ints[i] = Main.toNum(list[i]);
        }
        return addUp(ints);
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
