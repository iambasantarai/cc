/*
Create a class BankAccount that have data member accNo, Name, address, phone, gender,
constructor to set the bank details and showDetails() method to display the account details. Create
subclass SavingAccount which inherits BankAccount and have data member currentAmount and
month, constructor to set the data member, methods calcTotal() that update the currentAmount by
adding the bonus amount and return the result. (if saving month is below 3 mnth bonus is 2%, if
saving month is between 3 to 6 month bonus is 5%, if saving month is between 6 to 12 month bonus
is 8% and if saving month is above 1 year bonus is 11.03%). Now create the object of SavingAccount
and demonstrate the scenario.
 */
package Practical01;

class BankAccount{
    int accNo;
    String name, address, gender, phone;
    BankAccount(int accNo, String name, String address, String phone, String gender){
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
    }
    void showDetails(){
        System.out.println("Account Number: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
}

class SavingAccount extends BankAccount{
    int currentAmount;
    int month;
    SavingAccount(int accNo, String name, String gender, String address, String phone, int currentAmount, int month){
        super(accNo, name, address, phone, gender);
        this.currentAmount = currentAmount;
        this.month = month;
    }
    double calcTotal(){
        double bonus = 0;
        if(month < 3){
            bonus = 0.02;
        }else if(month >= 3 && month < 6){
            bonus = 0.05;
        }else if(month >= 6 && month < 12){
            bonus = 0.08;
        }else if(month >= 12){
            bonus = 0.1103;
        }
        return currentAmount + (currentAmount * bonus);
    }
}

public class Lab11 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(6969, "Basanta", "Male", "Sorakhutte", "9876543210", 10000, 3 );
        sa.showDetails();
        System.out.println("Current Amount: " + sa.currentAmount);
        System.out.println("Month: " + sa.month);
        System.out.println("Total Amount: " + sa.calcTotal());

    }
}
