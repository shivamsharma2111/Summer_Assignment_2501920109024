
interface LibraryUser {

    void accountReg();

    void bookReq();
}

class KidUser implements LibraryUser {

    int age;
    String booktype;

    @Override
    public void accountReg() {
        if (age < 12) {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        } else {
            System.out.println("You have successfully registered under a Kids Account");
        }
    }

    @Override
    public void bookReq() {
        if (booktype.equalsIgnoreCase("kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }

}

class AdultUser implements LibraryUser {

    int age;
    String booktype;

    @Override
    public void accountReg() {
        if (age < 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void bookReq() {
        if (booktype.equalsIgnoreCase("fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        //FOR KID CLASS
        KidUser kid = new KidUser();
        kid.age = 18;
        kid.accountReg();

        kid.age = 10;
        kid.accountReg();

        kid.booktype = "Kids";
        kid.bookReq();

        kid.booktype = "Fiction";
        kid.bookReq();

        //FOR ADULT CLASS
        AdultUser adult = new AdultUser();
        adult.age = 5;
        adult.accountReg();

        adult.age = 23;
        adult.accountReg();

        adult.booktype = "kids";
        adult.bookReq();

        adult.booktype = "fiction";
        adult.bookReq();
    }
}
