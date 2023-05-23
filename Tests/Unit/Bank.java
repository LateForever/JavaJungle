package Tests.Unit;

import java.util.ArrayList;
import java.lang.String;


public class Bank {

    private ArrayList<String> transfers = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();
    private String name;

    Bank(String name) {
        this.name = name;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addTransfer(String transfer) {
        transfers.add(transfer);
    }

    public static void main(String[] args) throws InsufficientBalanceException {

        Bank bank = new Bank("Alior Bank");

        Client client1 = new Client("Michał", "Balceszak", "89019023189", Currency.EUR, bank);
        Client client2 = new Client("Paweł", "Jakubowski", "89072023189", Currency.EUR, bank);
        Client client3 = new Client("Hubert", "Sobierajski", "09019023189", Currency.EUR, bank);
        Client client4 = new Client("Mariusz", "Pudzianowski", "19079023189", Currency.EUR, bank);

        bank.addClient(client1);
        bank.addClient(client2);
        bank.addClient(client3);
        bank.addClient(client4);

        client1.addAmount(15.000);
        client2.addAmount(20.000);
        client3.addAmount(17.429);

        Transfer transfer = new Transfer();

        String moneyTransfer = transfer.sendMoney(client1, client2, 5.000);

        bank.addTransfer(moneyTransfer);
    }
}
