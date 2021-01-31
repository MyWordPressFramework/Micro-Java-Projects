package emailApp;

public class EmailApp {

    public static void main(String[] args) {
        Email email=new Email("Denesh","Anandathasan");

//        email.setAlternateEmail("testemail@gmail.com");
//        System.out.println("Your alternative email :" + email.getAlternateEmail());
//
        email.setMailboxCapacity(500);
//        System.out.println("Your mail box capacity : " + email.getMailboxCapacity());

        System.out.println(email.showInfo());

    }
}
