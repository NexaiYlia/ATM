package atm.application;

import atm.model.ATM;
import atm.model.NotEnoughMoneyException;
import atm.model.PersonalCard;
import atm.model.model.BoundOfLimitException;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws NotEnoughMoneyException, InterruptedException, BoundOfLimitException {

        PersonalCard personalCard1 = new PersonalCard("8957 - 2546 - 2465 - 5745", 6556,100);
        PersonalCard personalCard2 = new PersonalCard("8957 - 2546 - 2465 - 5745", 7777,5);
        PersonalCard personalCard3 = new PersonalCard("8957 - 1101 - 4444 - 5745", 1221, 45);


        Set<PersonalCard> personalCards = new HashSet<PersonalCard>();

        personalCards.add(personalCard1);
        personalCards.add(personalCard2);
        personalCards.add(personalCard3);


       new ATM(personalCards).run();

    }
}
