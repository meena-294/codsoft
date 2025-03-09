import java.util.Scanner;
class CreateBankAccount{
private double balance;
public CreateBankAccount(double initialBalance){
this.balance=initialBalance;
}
public double getBalance()
{
return balance;
}

public boolean withdraw(double amount)
{
if(amount>0 && amount<=balance)
{
balance-=amount;
return true;
}
return false;
}

public boolean deposit(double amount)
{
if(amount>0)
{
balance+=amount;
return true;
}
return false;
}
}

class ATM{
private CreateBankAccount account;
private Scanner scanner;
public ATM(CreateBankAccount account)
{
this.account=account;
this.scanner=new Scanner(System.in);
}

public void start()
{
while(true)
{
System.out.println("\n ATM Menu:");
System.out.println("1. Withdraw");
System.out.println("2. Deposit");
System.out.println("3.Check balance");
System.out.println("4. Exit");
System.out.println("choose an option:");
int choice=scanner.nextInt();
switch(choice){
case 1:
withdraw();
break;
case 2:
deposit();
break;
case 3:
checkBalance();
break;
case 4:
System.out.println("Thank you for using the ATM.Goodbye!");
return;
default:
System.out.println("Invalid option. Please try again.");
}
}
}


private void withdraw()
{
System.out.println("Enter withdrawl amount:");
double amount=scanner.nextDouble();
if(account.withdraw(amount))
{
System.out.println("Withdrawl successful. please collect your cash.");
}
else
{
System.out.println("Insufficient balance or invalid amount.");
}
}


private void deposit()
{
System.out.println("Enter deposit amount:");
double amount=scanner.nextDouble();
if(account.deposit(amount))
{
System.out.println("Deposit successful.");
}
else
{
System.out.println("Invalid deposit amount.");
}
}

private void checkBalance()
{
System.out.println("Your current balance is:$"+account.getBalance());
}
}

public class ATMSystem
{
public static void main(String[] args)
{
CreateBankAccount useraccount=new CreateBankAccount(1000);
ATM atm=new ATM(useraccount);
atm.start();
}
}