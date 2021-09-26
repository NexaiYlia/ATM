package atm.model;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ATM extends PersonalCard {


    Scanner input = new Scanner(System.in);
    private Set<PersonalCard> personalCards;

    public ATM(Set<PersonalCard> personalCards) {
        this.personalCards = personalCards;
    }

    public void setCashCards(Set<PersonalCard> cashCards) {
        this.personalCards = personalCards;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Здравствуйте! Пожалуйста, вставьте свою банковскую карту");
            String inputCard = input.nextLine();
            System.out.println("Введите пароль:");
            int inputPwd = input.nextInt();

            PersonalCard cardToCheck = new PersonalCard(inputCard, inputPwd);
            //          for (int run = 0; run < 3; run++) {
            if (!personalCards.contains(cardToCheck)) {
                System.out.println("Неправильно введен номер карты или пинкод!");
                continue;
            } else {
                System.out.println("Неправильно введен пинкод!");

            }

        }
    }
}
