package com.sparta.ua;

public class FilmClassifications {

    public static void main( String[] args ) {//method

        //strongly typed language, Statically typed language
        //primitive - int, boolean, double, byte - 8 type
        int age = 14; //variable

        System.out.println(availableClassifications(age));

    }
    public static String availableClassifications(int ageOfViewer)
    {
        String result;
        if (ageOfViewer <= 12)
        {
            result = "U, PG & 12 films are available.";
        }
        else if (ageOfViewer >= 15 && ageOfViewer < 18)
        {
            result = "U, PG, 12 & 15 films are available.";
        }
        else
        {
            result = "All films are available.";
        }
        return result;
    }
}