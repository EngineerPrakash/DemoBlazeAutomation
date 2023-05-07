package DemoBlazeAutomation.domainobjects;

public class BillingDetails {

    private String Name;
    private String Country;

    private String City;
    private String Card;
    private String Month;
    private String Year;

    public BillingDetails(String name, String country, String city, String card, String month, String year) {
        this.Name = name;
        this.Country = country;
        this.City = city;
        this.Card = card;
        this.Month = month;
        this.Year = year;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCard() {
        return Card;
    }


    public void setCard(String card) {
        Card = card;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }


}
