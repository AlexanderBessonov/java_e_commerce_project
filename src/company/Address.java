package company;

public class Address {
    private String StreetNumber;
    private String StreetName;
    private String additionalAddressLine;
    private String zipCode;
    private String state;

    public Address(String streetNumber, String streetName, String additionalAddressLine, String zipCode, String state) {
        StreetNumber = streetNumber;
        StreetName = streetName;
        this.additionalAddressLine = additionalAddressLine;
        this.zipCode = zipCode;
        this.state = state;
    }

    public String getStreetNumber() {
        return StreetNumber;
    }

    public String getStreetName() {
        return StreetName;
    }

    public String getAdditionalAddressLine() {
        return additionalAddressLine;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }
}
