import org.checkerframework.checker.units.qual.C;

public class Customer {

    private final String name;
    private final String surname;
    private final String adress;
    private final String metro;
    private final String phoneNumber;

    public Customer(String name, String surname, String adress, String metro, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.metro = metro;
        this.phoneNumber = phoneNumber;
    }

    public static Customer getSimleCustomer() {
        return new Customer("Федька",
                "Петров",
                "ул Победы, дом 7, кв 5",
                "Сокольники",
                "87775647788");
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return adress;
    }

    public String getMetro() {
        return metro;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}


