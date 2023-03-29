package Tests.Unit;

import java.util.UUID;

public class Client  {

    private UUID id;
    private String name;
    private String surname;
    private String pesel;
    private Currency currency;
    private double amount;

    Client(String name, String surname, String pesel, Currency currency, Bank bank) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.currency = currency;
        this.amount = 0.00;
    }

    public void changeCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getAmmount() {
        return this.amount;
    }

    public void reduceAmount(double amount) {
        this.amount -= amount;
    }

    public void addAmount(double amount) {
        this.amount += amount;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }
}
