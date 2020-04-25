package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Possible but not recommended ways of using var
 */

public class StrangeVar {
    public static void main(String[] args) {
        var var = var(); //Local variable of implicitly inferred type
        System.out.println(var);
        System.out.println(var(var(var())));
    }

    //The function named var, may be legacy
    static public int var(int var) {
        return var ;
    }

    static public int var() {
        return 0;
    }
}

