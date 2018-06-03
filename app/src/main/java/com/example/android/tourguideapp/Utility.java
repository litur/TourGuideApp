package com.example.android.tourguideapp;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

    /**
     * Creates an Address String to be used to call an Intent to google Maps
     *
     * @param mCompany the name of the Company
     * @param mAddress the address of the location
     * @param mCity    the city of the location
     * @return The address to be passes to an Intent towards Google Maps
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

    /**
     * Creates a Date starting from a formatted String
     *
     * @param dateString the Sting to be converted to Date. The String must be coherent with the format specified in the strDateFormat variable
     * @param dateFormat dd-MM-yyyy H:mm
     * @return The Date resulting from the String
     */
    public static Date convertStringToDate(String dateString, String dateFormat) {
        Date date = null;
        SimpleDateFormat objSDF = new SimpleDateFormat(dateFormat); //Date format string is passed as an argument to the Date format object
        try {
            date = objSDF.parse(dateString);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return date;
    }
}
