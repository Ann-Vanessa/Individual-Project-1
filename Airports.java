package Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static Project1.read.airportfile;

/**
 * A class to represent an Airport object
 */

public class Airports {
    private String airportID;
    private String name;
    private String city;
    private String country;
    private String iataCode;
    private String icaoCode;
    private double latitude;
    private double longitude;
    private String altitude;
    private String timezone;
    private String dst;
    private String Tzdatabasetimezone;
    private String type;
    private String source;

    /** A constructor for the Airports class
     *
     * @param airportID
     * @param name
     * @param city
     * @param country
     * @param iatacode
     * @param icaoCode
     * @param latitude
     * @param longitude
     * @param altitude
     * @param timezone
     * @param dst
     * @param tzdatabasetimezone
     * @param type
     * @param source
     */
    public Airports(String airportID, String name, String city, String country,
                    String iatacode, String icaoCode, double latitude, double longitude,
                    String altitude, String timezone, String dst, String tzdatabasetimezone, String type, String source) {
        this.airportID = airportID;
        this.name = name;
        this.city = city;
        this.country = country;
        this.iataCode = iatacode;
        this.icaoCode = icaoCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.timezone = timezone;
        this.dst = dst;
        this.Tzdatabasetimezone = tzdatabasetimezone;
        this.type = type;
        this.source = source;
    }

    /**
     * accessor method for Airport ID
     * @return airportID
     */
    public String getAirportID() {
        return airportID;
    }

    /**
     * accessor method for Airport name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * accessor method for City name
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * accessor method for Country name
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * accessor method for IATA code
     * @return iataCode
     */
    public String getIatacode() {
        return iataCode;
    }

    /**
     * accessor method for ICAO code
     * @return icaoCode
     */
    public String getIcaoCode() {
        return icaoCode;
    }

    /**
     * accessor method for Latitude
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * accessor method for Longitude
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * accessor method for Altitude
     * @return altitude
     */
    public String getAltitude() {
        return altitude;
    }

    /**
     * accessor method for Timezone
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * accessor method for DST (Daylight Savings Time)
     * @return dst
     */
    public String getDst() {
        return dst;
    }

    /**
     * accessor method for Tz database time zone
     * @return Tzdatabasetimezone
     */
    public String getTzdatabasetimezone() {
        return Tzdatabasetimezone;
    }

    /**
     * accessor method for Type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * accessor method for Source of the data
     * @return source
     */
    public String getSource() {
        return source;
    }


    @Override
    // toString method for Airports class
    public String toString() {
        return "Airports{" +
                "airportID=" + airportID +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", iataCode='" + iataCode + '\'' +
                ", icaoCode='" + icaoCode + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                ", timezone=" + timezone +
                ", dst=" + dst +
                ", Tzdatabasetimezone='" + Tzdatabasetimezone + '\'' +
                ", type='" + type + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}