class BankAccount
{
    int balance = 1000;

    void deposit(int amount)
    {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String args[])
    {
        BankAccount b = new BankAccount();

        b.deposit(500);
        b.withdraw(200);

        System.out.println("Final Balance: " + b.balance);
    }
}
