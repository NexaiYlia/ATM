package atm.model;

import atm.model.model.BoundOfLimitException;

import java.util.Date;
import java.util.Scanner;
import java.util.Set;

public class ATM extends PersonalCard {
    public static final String FORMAT_OF_CARD_NUMBER = "([0-9]{4}\\-){3}[0-9]{4}";

    Scanner input = new Scanner(System.in);
    private Set<PersonalCard> personalCards;

    public ATM(Set<PersonalCard> personalCards) {
        this.personalCards = personalCards;
    }

    public void setCashCards(Set<PersonalCard> cashCards) {
    }

    public void run() throws NotEnoughMoneyException, InterruptedException, BoundOfLimitException {
        for (int i = 0; i <= 2; i++) {

            System.out.println("Здравствуйте! Пожалуйста, вставьте свою банковскую карту");
            String inputCard = input.nextLine();

            System.out.println("Введите пароль:");
            int inputPwd = input.nextInt();

            PersonalCard cardToCheck = new PersonalCard(inputCard, inputPwd, balance);
            Boolean result = false;
            if (inputCard.equals("8957 - 2546 - 2465 - 5745") && (pinCode == 6556)) {
                result = true;
            } else if (inputCard.equals("8957 - 2546 - 2465 - 5745") && (pinCode == 7777)) {
                result = true;
            } else if (inputCard.equals("8957 - 1101 - 4444 - 5745") && (pinCode == 1221)) {
                result = true;
            }

            if (checkCardNumber(inputCard) && result) {
                menu();

            } else if (i == 2) {
                System.out.println("Данные введены неверно! Карта заблокирована!");
                return;
            } else {
                continue;

            }
        }
    }

    public boolean checkCardNumber(String number) {
        if (((number.length() == 19) && number.matches(FORMAT_OF_CARD_NUMBER))) {
            return true;
        } else {
            System.out.println("Номер карты введен неверно");
            return false;
        }
    }


    public void menu() throws InterruptedException, NotEnoughMoneyException, BoundOfLimitException {
        boolean status = false;
        do {
            System.out.println("Авторизация прошла успешно.\n1.Проверить баланс;\n2.Пополнить баланс;\n3.Снять наличные;\n4.Закончить работу.\nВыберите операцию:");
            int userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    status = true;
                    System.out.println("Баланс лицевого счета составляет:" + getBalance());
                    break;
                case 2:
                    status = true;
                    System.out.println("Введите сумму для пополнения счета:");
                    int money = input.nextInt();
                    putMoney(money);
                    System.out.println("Операция выполнена успешно.Баланс лицевого счета равен " + balance);
                    break;
                case 3:
                    status = true;
                    System.out.println("Введите сумму для выдачи наличными:");
                    money = input.nextInt();
                    takeMoney(money);
                    System.out.println("Операция выполнена успешно.Баланс лицевого счета равен " + balance);
                    break;
                case 4:
                    return;

                default:
                    status = false;
                    System.out.println("Операция введена некорректно");
                    return;
            }
        } while (status);
    }
}
