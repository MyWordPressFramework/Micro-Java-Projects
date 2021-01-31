package emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private  String department;
    private String email;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength=10;
    private String companySuffix="xyzcompany.com";

    // Constructor to receive the first name and last name
    public Email( String firstName,String lastName){

        this.firstName = firstName;
        this.lastName= lastName;
        //System.out.println("Email Created " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDeparment();
        System.out.println("Department :" + this.department);
//
//        //Call a method that returns a random password
//        this.password = randomPassword(defaultPasswordLength);
//
//        System.out.println("Your password is :" + this.password );

        //Combine elemnts to generate email
        email = firstName.toLowerCase()+ "."+ lastName.toLowerCase()+"@"+department.toLowerCase()+companySuffix;
        //System.out.println("Your email is :" + email);


    }

    //Ask for the department
    private String setDeparment(){
        System.out.println("New worker : " +firstName + ".\n Department Codes: \n1 for Sales\n2 for Development \n3 for Accounting\n0 for None\n Enter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoise = in.nextInt();
        if(depChoise == 1) {return  "Sales";}
        else if (depChoise == 2 ) {return  "Dev";}
        else if (depChoise == 3) {return "Account";}
        else {return "";}

    }

    //Genarate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIGHIJKLMNOPQRSTUVWXYZ0123456789%$#&!@";
        char [] password= new char[length];
        for ( int i = 0 ; i < length;i++)
        {
            int rand = (int)(Math.random()* passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return  new String (password);

    }
    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Set the alternative email
    public void setAlternateEmail(String email){
        this.alternateEmail = email;
    }

    //Change the password
    public void setChangePassword(String changePassword){
        this.password = changePassword;
    }

    public int getMailboxCapacity(){
        return  mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return  password;
    }

    public String showInfo(){
        return "DISPLAY NAME : " + firstName + " " + lastName +
                "\nCOMPANY EMAIL : " + email +
                "\nMAILBOX CAPACITY : " + mailboxCapacity + "mb";
    }
}
