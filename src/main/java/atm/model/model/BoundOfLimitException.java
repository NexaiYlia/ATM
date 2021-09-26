package atm.model.model;

public class BoundOfLimitException extends Exception {
    private static final String BOUND_OF_LIMIT_MASSAGE = "Запрашиваемая сумма превышает допустимый лимит";

    public BoundOfLimitException() {
        super(BOUND_OF_LIMIT_MASSAGE);
    }
}
