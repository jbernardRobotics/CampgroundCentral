package main.java.Camping;

import main.java.App;
import main.java.Exceptions.InvalidSiteException;

import java.util.ArrayList;

public class Site {
    private static ArrayList<String> availableSiteTypes;
    private String siteName;
    private String siteType;
    private ArrayList<Reservation> listOfReservations;

    public Site(String siteName, String siteType, ArrayList<Reservation> listOfReservations) {
        this.siteName = siteName;
        this.siteType = siteType;
        this.listOfReservations = listOfReservations;
        //need to read a csv for the availableSiteTypes assignment here.
    }

    public Site(String siteName, ArrayList<Reservation> listOfReservations) {
        this.siteName = siteName;
        this.listOfReservations = listOfReservations;
        //need to read a csv for the availableSiteTypes assignment here.

    }

    public Site(String siteName) {
        this.siteName = siteName;
        //need to read a csv for the availableSiteTypes assignment here.
    }

    //Getters below here:-------------
    public String getSiteName() {
        return siteName;
    }

    public ArrayList<Reservation> getListOfReservations() {
        return listOfReservations;
    }

    public static ArrayList<String> getAvailableSiteTypes() {
        return availableSiteTypes;
    }

    public String getSiteType() {
        return siteType;
    }

    //Setters below here:--------------
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setListOfReservations(ArrayList<Reservation> listOfReservations) {
        this.listOfReservations = listOfReservations;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

}
