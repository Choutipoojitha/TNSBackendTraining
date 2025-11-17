package DataTypes;

public class DataTypes {

    // Instance variables of all primitive data types
    byte speed = 120;                 // car speed in km/h
    short daysInYear = 365;           // total days in a year
    int salary = 750000;              // yearly salary
    long worldPopulation = 8_100_000_000L; // world population
    float height = 5.6f;              // height in feet
    double earthRadius = 6371.0088;   // radius of earth in km
    boolean isRaining = false;        // weather condition
    char currencySymbol = '₹';        // Indian currency symbol

    // Method to display all data type values
    void showData() {
        System.out.println("Java Primitive Data Types Example (New Values) ");
        System.out.println("byte (speed): " + speed);
        System.out.println("short (days in year): " + daysInYear);
        System.out.println("int (salary): " + salary);
        System.out.println("long (world population): " + worldPopulation);
        System.out.println("float (height in feet): " + height);
        System.out.println("double (Earth radius): " + earthRadius);
        System.out.println("boolean (is it raining?): " + isRaining);
        System.out.println("char (currency symbol): " + currencySymbol);
    }
}
