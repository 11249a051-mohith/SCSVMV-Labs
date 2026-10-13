//Aim:
To write a Java program to demonstrate inheritance using a bank account and savings bank account.

//Algorithm:
Start the program.
Create an Account class with methods to credit, debit, and display balance.
Create an SBAccount class that extends Account and displays the interest rate.
Create an object of SBAccount.
Perform credit and debit operations.
Display the final balance and interest rate.
Stop the program.


//program:

class Account {
    int accountNumber, balance;

    Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void credit(int amount) {
        balance = balance + amount;
    }

    void debit(int amount) {
        balance = balance - amount;
    }

    void displayBalance() {
        System.out.println("Balance = " + balance);
    }
}

class SBAccount extends Account {
    double rate;

    SBAccount(int accountNumber, int balance, double rate) {
        super(accountNumber, balance);
        this.rate = rate;
    }

    void displayInterestRate() {
        System.out.println("Interest Rate = " + rate);
    }
}

class AccountDemo {
    public static void main(String args[]) {
        SBAccount obj1;
        obj1 = new SBAccount(1001, 5000, 6.5);

        obj1.credit(2000);
        obj1.debit(1000);

        obj1.displayBalance();
        obj1.displayInterestRate();
    }
}

//Result:
The program successfully demonstrates inheritance and displays the updated account balance and interest rate.
