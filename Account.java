public class Account {
    protected double amount;


    public double getAmount() {
        return amount;
    }
    public Account(double a) {
        this.amount = a;
    }

    public boolean registerDeposit(double value) {
        if(value <= 0) {
            System.out.println("Incorrect value");
            return false;
        } else {
            amount += value;
            System.out.println("Deposit R$ " + value + " made successfully.");
            System.out.println("Current balance: R$ " + amount);
            return true;
        }
    }
    
    public boolean registerWithdraw(double value) {
        double fees = value * 0.005;
        double totalDebit = value + fees;

        if(value > amount) {
            System.out.println("Insufficient Funds");
            return false;
        } else if(value <= 0) {
            System.out.println("Incorrect value");
            return false;
        } else {
            amount -= totalDebit;
            System.out.println("Withdraw: R$ " + value + " made with fees of R$ " + fees);
            System.out.println("Remaining balance: R$ " + amount);
            return true;
        }
        
        
    }

}