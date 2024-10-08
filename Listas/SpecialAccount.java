public class SpecialAccount extends Account {

    public SpecialAccount(double a) {
        super(a);
    }

    public boolean specialWithdraw(double value) {
        double fees = value * 0.001;
        double totalDebit = value + fees;
        if(totalDebit > amount) {
            System.out.println("Insufficient Funds");
            return false;
        } else if(value <= 0) {
            System.out.println("Incorrect value");
            return false;
        } else {
            amount -= totalDebit;
            System.out.println("Special withdraw: R$ " + value + " made with fees of R$ " + fees);
            System.out.println("Remaining balance: R$ " + amount);
            return true;
        }
    }
}