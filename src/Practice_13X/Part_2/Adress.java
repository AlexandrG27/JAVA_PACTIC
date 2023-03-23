package Practice_13X.Part_2;
public class Adress
{
    private String country;
    private String region;
    private String city;
    private String street;
    private String building;
    private String housing;
    private String apartment;
    public Adress(String country, String region, String city, String street, String building, String housing, String apartment)
    {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.building = building;
        this.housing = housing;
        this.apartment = apartment;
    }
    @Override
    public String toString()
    {
        return "Adress{" + "country='" + country + '\'' + ", region='" + region + '\'' + ", city='" + city + '\'' +
                ", street='" + street + '\'' + ", building='" + building + '\'' +
                ", housing='" + housing + '\'' + ", apartment='" + apartment + '\'' + '}';
    }
}