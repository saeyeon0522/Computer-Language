import java.util.Scanner;
class Phone {
    private String name, tel;
    public String getName() {return name;}
    public String getTel() {return tel;}
    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
}

class PhoneBook {
    Scanner scanner = new Scanner(System.in);
    Phone[] phoneBook;
    void register() {
        System.out.print("Number of person to store? >> ");
        int num = scanner.nextInt();
        phoneBook = new Phone[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Name and Tel. No. >> ");
            String name = scanner.next();
            String tel = scanner.next();
            Phone input = new Phone(name, tel);
            phoneBook[i] = input;
        }
    }

    String search(String name) {
        for (int i = 0; i < phoneBook.length; i++)
            if (name.equals(phoneBook[i].getName())) return phoneBook[i].getTel();
        return null;
    }

    void execute() {
        register();
        while (true) {
            System.out.print("Who do you wanna search for? >> ");
            String input = scanner.next();
            if (input.equals("stop")) break;
            if (search(input) != null)
                System.out.println(input + "'s telephone no. is " + search(input));
            else System.out.println(input + " does not exist.");
        }
        scanner.close();
    }
    public PhoneBook() {}
}

public class Q3_Phonebook {
    public static void main(String[] args) {new PhoneBook().execute();}
}


