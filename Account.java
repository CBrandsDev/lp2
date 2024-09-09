public class Account {
    protected double amount;


    public double getAmount() {
        return amount;
    }

    public Account(double a) {
        amount = a;
    }

    public void registerDeposit(double value) {
        if(value <= 0) {
            System.out.println("Incorrect value");
        } else {
            amount += value;
        }
        System.out.println("Amount: R$ " + amount );
    }
    
    public void registerWithdraw(double value) {
        double fees = value * 0.05;
        if(value > amount) {
            System.out.println("Insufficient Funds");
        } else if(value <= 0) {
            System.out.println("Incorrect value");
        } else {
            amount -= value;
            amount -= fees;
        }
        System.out.println("Withdraw: R$ " + value);
        System.out.println("Fees: R$ " + fees);
        System.out.println("Amount: R$ " + amount );
        
    }
}