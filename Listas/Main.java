public class Main {
    public static void main(String[] args) {
        Thick t1 = new Thick();
        t1.start();
        // question 1 and 2
        Data d = new Data(12, 5         , 2024);
        d.printData();
        d.getRemainingDayYear();

        // question 4 and 5
        Account c = new Account(1300);
        SpecialAccount s = new SpecialAccount(1300);
        c.registerDeposit(200);
        c.registerWithdraw(500);
        s.registerDeposit(200);
        s.specialWithdraw(500);

        


    }
}