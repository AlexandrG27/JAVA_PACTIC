package Practice_30X;
public class Adress
{
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private int apartmentNumber;
    public Adress EMPTY_ADDRESS;
    public Adress() { }
    public Adress(String cityName, int zipCode, String streetName, int buildingNumber, char buildingLetter, int apartmentNumber)
    {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
    }
    public String getCityName()
    {
        return cityName;
    }
    public int getZipCode()
    {
        return zipCode;
    }
    public String getStreetName()
    {
        return streetName;
    }
    public int getBuildingNumber()
    {
        return buildingNumber;
    }
    public char getBuildingLetter()
    {
        return buildingLetter;
    }
    public int getApartmentNumber()
    {
        return apartmentNumber;
    }
}
