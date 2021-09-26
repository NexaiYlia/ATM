package atm.model;

import atm.model.model.BoundOfLimitException;

public class PersonalCard {
    public int pinCode;
    public String cardNumber;
    public double balance;
    int limitOfATM = 1000;


    public PersonalCard(int pinCode, String cardNumber) {
        this.pinCode = pinCode;
        this.cardNumber = cardNumber;
    }

    public PersonalCard(String cardNumber, int pinCode, double balance) {
        this.pinCode = pinCode;
        this.cardNumber = cardNumber;
        this.balance = balance;
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

    public int takeMoney(int money) throws NotEnoughMoneyException, BoundOfLimitException {

        if (money > balance)
            throw new NotEnoughMoneyException();
        else if (money > limitOfATM) {
            throw new BoundOfLimitException();
        } else {
            balance -= money;
            return money;
        }
    }

    public int putMoney(int money) throws BoundOfLimitException {
        if (money > limitOfATM) {
            throw new BoundOfLimitException();
        } else {
            balance += money;
            return money;
        }

    }
}
