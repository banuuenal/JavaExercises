package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------SpeedConverter----------");
        System.out.println(SpeedConverter.toMilesPerHour(1.5)); //should return value 1
        System.out.println(SpeedConverter.toMilesPerHour(10.25)); //should return value 6
        System.out.println(SpeedConverter.toMilesPerHour(-5.6)); //should return value -1
        System.out.println(SpeedConverter.toMilesPerHour(25.42)); //should return value 16
        System.out.println(SpeedConverter.toMilesPerHour(75.114)); //should return value 47

        SpeedConverter.printConversion(1.5); // 1.5 km/h = 1 mi/h
        SpeedConverter.printConversion(10.25); // 10.25 km/h = 6 mi/h
        SpeedConverter.printConversion(-5.6); // Invalid Value
        SpeedConverter.printConversion(25.42); // 25.42 km/h = 16 mi/h
        SpeedConverter.printConversion(75.114); // 75.114 km/h = 47 mi/h

        System.out.println("----------MegaBytesConverter----------");
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500); // "2500 KB = 2 MB and 452 KB"
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024); // "Invalid Value" because parameter is less than 0.
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000); // "5000 KB = 4 MB and 904 KB"

        System.out.println("----------BarkingDog----------");
        System.out.println(BarkingDog.shouldWakeUp(true, 1)); // should return true
        System.out.println(BarkingDog.shouldWakeUp(false, 2)); // should return false since the dog is not barking.
        System.out.println(BarkingDog.shouldWakeUp(true, 8)); // should return false, since it's not before 8.
        System.out.println(BarkingDog.shouldWakeUp(true, -1)); // should return false since the hourOfDay parameter needs to be in a range 0-23.

        System.out.println("----------LeapYear----------");
        System.out.println(LeapYear.isLeapYear(-1600)); //should return false since the parameter is not in range (1-9999)
        System.out.println(LeapYear.isLeapYear(1600)); //should return true since 1600 is a leap year
        System.out.println(LeapYear.isLeapYear(2017)); //should return false since 2017 is not a leap year
        System.out.println(LeapYear.isLeapYear(2000));  //should return true because 2000 is a leap year

        System.out.println("----------DecimalComparator----------");
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175)); //should return true since numbers are equal up to 3 decimal places.
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176)); //should return false since numbers are not equal up to 3 decimal places
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0)); //should return true since numbers are equal up to 3 decimal places.
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));// should return false since numbers are not equal up to 3 decimal places.

        System.out.println("----------NumberOfDaysInMonth----------");
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));// should return 31 since January has 31 days.
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020)); //should return 29 since February has 29 days in a leap year and 2020 is a leap year.
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018)); // should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020)); // should return -1 since the parameter month is invalid.
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020)); // should return -1 since the parameter year is outside the range of 1 to 9999.


        System.out.println("----------Seconds and Minutes Challenge----------");
        System.out.println(Duration.getDurationString(65, 45));
        System.out.println(Duration.getDurationString(3945L));

        System.out.println("----------PaintJob----------");
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2)); //should return -1 since the width parameter is invalid
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2)); // should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1)); // should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.

        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5)); // should return -1 since the width parameter is invalid
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5)); // should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35)); // should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.

        System.out.println(PaintJob.getBucketCount(3.4, 1.5)); // should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5
        System.out.println(PaintJob.getBucketCount(6.26, 2.2)); // should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
        System.out.println(PaintJob.getBucketCount(3.26, 0.75)); // should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .

    }
}
