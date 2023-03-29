package Tests.Unit;

import java.util.UUID;

public class Transfer {

    private UUID id;

    public String sendMoney(Client sender, Client receiver, double amount) throws InsufficientBalanceException  {

        if (sender.getAmmount() - amount < 0) {
            throw new InsufficientBalanceException("Client " + sender.getFullName() + " does not have sufficient balance to transfer " + amount);
        }

        sender.reduceAmount(amount);
        receiver.addAmount(amount);

        this.id = UUID.randomUUID();

        return "Transfer: " + id + " sent from " + sender.getFullName() + " to " + receiver.getFullName() + " amount: " + amount;
    }
}
