package atm.model;

public class PersonalCard {
    public int pinCode;
    public String cardNumber;
    public double balance;

    public PersonalCard() {
    }

    public PersonalCard(String cardNumber, int pinCode) {
        this.pinCode = pinCode;
        this.cardNumber = cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public PersonalCard setPinCode(int pinCode) {
        this.pinCode = pinCode;
        return this;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public PersonalCard setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public PersonalCard setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public int takeMoney(int money) throws NotEnoughMoneyException {
        if (money > balance)
            throw new NotEnoughMoneyException();
        else {
            balance -= money;
            return money;
        }
    }

    public int putMoney(int money) {
        balance += money;
        return money;
    }

}
