public class SpecialAccount extends Account {

    public SpecialAccount(double amount) {
        super(amount);
    }

    public void specialWithdraw(double value) {
        double fees = value * 0.01;
        if(value > super.amount) {
            System.out.println("Insufficient Funds");
        } else if(value <= 0) {
            System.out.println("Incorrect value");
        } else {
            super.amount -= value;
            super.amount -= fees;
        }
        System.out.println("Withdraw: R$ " + value);
        System.out.println("Fees: R$ " + fees);
        System.out.println("Amount: R$ " + super.amount );
    }
}