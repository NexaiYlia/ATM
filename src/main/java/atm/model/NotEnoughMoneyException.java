package atm.model;

public class NotEnoughMoneyException extends Exception {
    private static final String NOT_ENOUGH_MONEY_MASSEGE = "Недостаточно средств для выполнения данной операции!!!";

    public NotEnoughMoneyException() {
        super(NOT_ENOUGH_MONEY_MASSEGE);
    }
}
