package com.example.android.tourguideapp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

    /**
     * Creates an Address String to be used to call an Intent to google Maps
     *
     * @param mCompany the name of the Company
     * @param mAddress The address of the location
     * @param mCity    city of the location
     * @return The address to ber
     */
    public static String formatStringforMapIntent(String mCompany, String mAddress, String mCity) {
        String finalAddress = Constants.FIXEDPARTOFTHEADDRESS;
        String formattedCity = "";
        String formattedCompany = "";
        String formattedAddress = mAddress.replace(" ", "+");

        if (!mCompany.equals("")) {
            formattedCompany = mCompany.replace(" ", "+");
            finalAddress = finalAddress + formattedCompany + "%2C+";
        }

        finalAddress = finalAddress + formattedAddress;

        if (!mCity.equals("")) {
            formattedCity = mCity.replace(" ", "+");
            finalAddress = finalAddress + "+" + formattedCity;
        }

        return finalAddress;
    }

    public static Date convertStringToDate(String dateString) {
        Date date = null;
        String strDateFormat = "dd-MM-yyyy"; //Date format is Specified
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); //Date format string is passed as an argument to the Date format object
        try {
            date = objSDF.parse(dateString);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return date;
    }
}
