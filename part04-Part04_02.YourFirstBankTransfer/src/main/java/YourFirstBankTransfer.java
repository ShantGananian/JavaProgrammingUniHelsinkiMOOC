
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mattewAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);

        mattewAccount.withdrawal(100);

        myAccount.deposit(100);

        System.out.println("End state");
        System.out.println(mattewAccount);
        System.out.println(myAccount);

    }
}
