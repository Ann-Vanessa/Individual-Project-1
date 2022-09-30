package Project1;

/**
 * A class to represent a Route object
 */

public class Routes {
    private String airlineCode;
    private int airlineID;
    private String source_airportCode;
    private String source_airportID;
    private String dest_airportCode;
    private String dest_airportID;
    private String codeShare;
    private int stops;
    private String equipment;

    /**
     *
     * @param airlineCode
     * @param airlineID
     * @param source_airportCode
     * @param source_airportID
     * @param dest_airportCode
     * @param dest_airportID
     * @param codeShare
     * @param stops
     * @param equipment
     */
    public Routes(String airlineCode, int airlineID, String source_airportCode, String source_airportID, String dest_airportCode, String dest_airportID, String codeShare, int stops, String equipment) {
        this.airlineCode = airlineCode;
        this.airlineID = airlineID;
        this.source_airportCode = source_airportCode;
        this.source_airportID = source_airportID;
        this.dest_airportCode = dest_airportCode;
        this.dest_airportID = dest_airportID;
        this.codeShare = codeShare;
        this.stops = stops;
        this.equipment = equipment;
    }

    /**
     * accessor method for Airline code
     * @return airlineCode
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * accessor method for Airline ID
     * @return airlineID
     */
    public int getAirlineID() {
        return airlineID;
    }

    /**
     * accessor method for Source airport code
     * @return source_airportCode
     */
    public String getSource_airportCode() {
        return source_airportCode;
    }

    /**
     * accessor method for Source airport ID
     * @return source_airportID
     */
    public String getSource_airportID() {
        return source_airportID;
    }

    /**
     * accessor method for Destination airport code
     * @return dest_airportCode
     */
    public String getDest_airportCode() {
        return dest_airportCode;
    }

    /**
     * accessor method for Destination airport ID
     * @return dest_airportID
     */
    public String getDest_airportID() {
        return dest_airportID;
    }

    /**
     * accessor method for Code-share
     * @return codeShare
     */
    public String getCodeshare() {
        return codeShare;
    }

    /**
     * accessor method for Stops
     * @return stops
     */
    public int getStops() {
        return stops;
    }

    /**
     * accessor method for Equipment
     * @return equipment
     */
    public String getEquipment() {
        return equipment;
    }

    @Override
    // toString method for Routes class
    public String toString() {
        return "Routes{" +
                "airlineCode='" + airlineCode + '\'' +
                ", airlineID=" + airlineID +
                ", source_airportCode='" + source_airportCode + '\'' +
                ", source_airportID=" + source_airportID +
                ", dest_airportCode='" + dest_airportCode + '\'' +
                ", dest_airportID=" + dest_airportID +
                ", codeShare=" + codeShare +
                ", stops=" + stops +
                ", equipment='" + equipment + '\'' +
                '}';
    }
}
