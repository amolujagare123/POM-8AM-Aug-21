package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

   public static String convertCountry(String countryShort)
    {
        String convertedCountry="";

        switch (countryShort)
        {
            case "IN" : convertedCountry = "India";break;
            case "CN" : convertedCountry = "China";break;
            case "AF" : convertedCountry = "Afghanistan";break;
            case "AS" : convertedCountry = "American Samoa";break;
        }

        return convertedCountry;
    }


   public static String convertGenderCode(String genderDB)
    {
        String genderFUllForm="";

        switch (genderDB)
        {
            case "0" : genderFUllForm ="Male";break;
            case "1" : genderFUllForm ="Female";break;
            case "2" : genderFUllForm ="Other";break;
        }


        return genderFUllForm;

    }

   public static String convertDate(String dateDBStr) throws ParseException //yyyy-MM-dd
   {
       // 1. convert date came from DB in the form of string into date
       Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateDBStr);

       String convertedDate = new SimpleDateFormat("MM/dd/yyyy").format(date);

       return convertedDate;
   }
}
