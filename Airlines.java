package Project1;

/**
 * A class to represent an Airline object
 */

public class Airlines {
    private int airlineID;
    private String name;
    private String alias;
    private String iataCode;
    private String icaoCode;
    private String callsign;
    private String country;
    private String active;

    /**
     *
     * @param airlineID
     * @param name
     * @param alias
     * @param iataCode
     * @param icaoCode
     * @param callsign
     * @param country
     * @param active
     */
    public Airlines(int airlineID, String name, String alias, String iataCode, String icaoCode, String callsign, String country, String active) {
        this.airlineID = airlineID;
        this.name = name;
        this.alias = alias;
        this.iataCode = iataCode;
        this.icaoCode = icaoCode;
        this.callsign = callsign;
        this.country = country;
        this.active = active;
    }

    /**
     * accessor method for Airline ID
     * @return airportID
     */
    public int getAirlineID() {
        return airlineID;
    }

    /**
     * accessor method for Airline name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * accessor method for Alias
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * accessor method for IATA code
     * @return iataCode
     */
    public String getIataCode() {
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
     * accessor method for Callsign
     * @return callsign
     */
    public String getCallsign() {
        return callsign;
    }

    /**
     * accessor method for Country
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * accessor method for Active
     * @return active
     */
    public String getActive() {
        return active;
    }

    @Override
    // toString method for Airlines class
    public String toString() {
        return "Airlines{" +
                "airlineID=" + airlineID +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", iataCode='" + iataCode + '\'' +
                ", icaoCode='" + icaoCode + '\'' +
                ", callsign='" + callsign + '\'' +
                ", country='" + country + '\'' +
                ", active=" + active +
                '}';
    }
}
