package atm.application;

import atm.model.ATM;
import atm.model.PersonalCard;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        PersonalCard personalCard1 = new PersonalCard("8957 - 2546 - 2465 - 5745", 6556);
        PersonalCard personalCard2 = new PersonalCard("8957 - 2546 - 2465 - 5745", 7777);
        PersonalCard personalCard3 = new PersonalCard("8957 - 1101 - 4444 - 5745", 1221);
        PersonalCard personalCard4 = new PersonalCard("8957 - 2546 - 2465 - 6666", 6333);

        Set<PersonalCard> personalCards = new HashSet<PersonalCard>();

        personalCards.add(personalCard1);
        personalCards.add(personalCard2);
        personalCards.add(personalCard3);
        personalCards.add(personalCard4);

       new ATM(personalCards).run();

    }
}
