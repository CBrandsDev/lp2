public class Main {
    public static void main(String[] args) {
        // questão 1 e 2
        Data d = new Data(12, 5, 2024);
        d.printData();
        d.getRemainingDayYear();



        // questão 4 e 5
        Account c = new Account(1300);
        SpecialAccount s = new SpecialAccount(1300);
        c.registerDeposit(200);
        c.registerWithdraw(500);
        c.specialWithdraw(300);
    }
}