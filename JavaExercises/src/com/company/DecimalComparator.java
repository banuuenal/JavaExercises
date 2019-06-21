package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

EXAMPLES OF INPUT/OUTPUT:
* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.

TIP: Use paper and pencil.
TIP: Use casting.
 */
public class DecimalComparator {

    public static final double EPSILON = 1E-4;

    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat threeDForm = new DecimalFormat("#.###",symbols);

        threeDForm.setRoundingMode(RoundingMode.DOWN);
        double truncatedOne = Double.valueOf(threeDForm.format(one));

        double truncatedTwo =  Double.valueOf(threeDForm.format(two));
        return Math.abs(truncatedOne-truncatedTwo)< EPSILON;
    }
}
