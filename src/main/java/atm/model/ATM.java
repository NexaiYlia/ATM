package atm.model;

import java.util.Date;
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

    public void run() throws NotEnoughMoneyException, InterruptedException {
        for (int i = 0; i < 2; i++) {

            System.out.println("Здравствуйте! Пожалуйста, вставьте свою банковскую карту");
            String inputCard = input.nextLine();
            System.out.println("Введите пароль:");
            int inputPwd = input.nextInt();

            PersonalCard cardToCheck = new PersonalCard(inputCard, inputPwd, balance);
            Boolean result = false;
            if (cardNumber.equals("8957 - 2546 - 2465 - 5745") && (pinCode == 6556)) {
                result = true;
            } else if (cardNumber.equals("8957 - 2546 - 2465 - 5745") && (pinCode == 7777)) {
                result = true;
            } else if (cardNumber.equals("8957 - 1101 - 4444 - 5745") && (pinCode == 1221)) {
                result = true;
            }

            if (result == false) {
                System.out.println("Неправильно введен номер карты или пинкод! Попробуйте еще раз!");
                continue;
            } else if (i == 2) {
                System.out.println("Данные введены неверно! Карта заблокирована!");
                return;

            }


        }
        menu();
    }

    public void menu() throws InterruptedException, NotEnoughMoneyException {
        System.out.println("Авторизация прошла успешно. Выберите операцию:\n1.Проверить баланс;\n2.Пополнить баланс.\n3.Снять наличные");
        int userChoice = input.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Баланс лицевого счета составляет:" + getBalance());
                break;
            case 2:
                System.out.println("Введите сумму для пополнения счета:");
                int money1 = input.nextInt();
                putMoney(money1);
                break;
            case 3:
                System.out.println("Введите сумму для выдачи наличными:");
                int money2 = input.nextInt();
                takeMoney(money2);
                break;
            default:
                wait(10000);
                System.out.println("Время сессии закончилось. Заберите карту!");
        }
    }
}
