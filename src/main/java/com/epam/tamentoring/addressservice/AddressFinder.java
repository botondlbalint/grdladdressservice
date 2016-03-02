package com.epam.tamentoring.addressservice;

/**
 * Address finder
 *
 */
public class AddressFinder
{
    public static String[] getAddressOptions(String zipCode){
        String [] options;
        switch (zipCode)
        {
            case "1082":
                options=new String[]{
                        "Baross utca",
                        "Corvin köz",
                        "Futó utca",
                        "Harminckettesek tere",
                        "Hock János utca",
                        "Horváth Mihály tér",
                        "Kisfaludy utca",
                        "Kisstáció utca",
                        "Kistemplom utca",
                        "Leonardo da Vinci utca",
                        "Nagytemplom utca",
                        "Nap utca",
                        "Üllői út",
                        "Vajdahunyad utca"
                };
                break;
            default:
                options=new String[]{""};
        }
        return options;
    }


}
