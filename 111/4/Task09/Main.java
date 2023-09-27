import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Person", "a/bc", "121", 243.01);
        BankAccount acc2 = new BankAccount("Human", "c/de", "122", 115.000015);
        BankAccount acc3 = new BankAccount("Living", "e/fg", "123", 521.1);
        acc1.addInterest();
        acc3.addInterest();
        out.printf("Name: %s%nAddress: %s%nAccount ID: %s%nBalance: %.2f%n%n", acc1.name, acc1.address, acc1.accountID, acc1.balance);
        out.printf("Name: %s%nAddress: %s%nAccount ID: %s%nBalance: %.2f%n%n", acc2.name, acc2.address, acc2.accountID, acc2.balance);
        out.printf("Name: %s%nAddress: %s%nAccount ID: %s%nBalance: %.2f%n", acc3.name, acc3.address, acc3.accountID, acc3.balance);
    }
}