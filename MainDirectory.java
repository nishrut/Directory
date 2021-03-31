import java.util.Scanner;

public class MainDirectory {
    public static void main(String[] args) {
        FriendList friend_list = new FriendList();
        // * for testing adding some friends initially, you can even add your friends
        // * while running it
        // *
        // -----------------------------------------------------------------------------------------------
        friend_list.addInFriendList(new Person("John", "Smith", "2269999999", 4, 23));
        friend_list.addInFriendList(new Person("Andrew", "Sam", "2268888888", 8, 30));
        friend_list.addInFriendList(new Person("Peter", "Methew", "2267777777", 6, 18));
        friend_list.addInFriendList(new Person("Josh", "Buttler", "2266666666", 4, 8));
        friend_list.addInFriendList(new Person("Nishrut", "Patel", "2265555555", 4, 10));
        friend_list.addInFriendList(new Person("Peter", "Michel", "2264444444", 6, 1));
        // *--------------------------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n|===========================================================|");
            System.out.println("|Enter                   Action                             |");
            System.out.println("|-----------------------------------------------------------|");
            System.out.println("| A - - - - - - - - - -Add friend - - - - - - - - - - - - - |");
            System.out.println("| U - - - - - - - - See unsorted list - - - - - - - - - - - |");
            System.out.println("| R - - - - - - - - - Remove friend - - - - - - - - - - - - |");
            System.out.println("| C - - - - detail of person from cell number - - - - - - - |");
            System.out.println("| D - - - - detail of person from first name- - - - - - - - |");
            System.out.println("| G - - - - detail of person from last name- - - - - -- - - |");
            System.out.println("| H - - - - - - - -Edit Friend's detail - - - - - - - - - - |");
            System.out.println("| F - - - - - -See List sorted by first name- - - - - - - - |");
            System.out.println("| L - - - - - - See List sorted by last name- - - - - - - - |");
            System.out.println("| B - - -See List of person born in particular month- - - - |");
            System.out.println("| T - - - - - - - Total number of Friends - - - - - - - - - |");
            System.out.println("| E                       Exit                              |");
            System.out.println("|===========================================================|");

            System.out.print("Enter your response here:- ");
            String answer = input.next();
            System.out.println("\n");

            if (answer.toUpperCase().charAt(0) == 'A') {
                System.out.print("Enter first name:- ");
                String first_name = input.next();

                System.out.print("Enter last name:- ");
                String last_name = input.next();

                System.out.print("Enter cell number:- ");
                String cell_number = input.next();

                System.out.print("Enter Birth month:- ");
                int month = input.nextInt();

                System.out.print("Enter Birth Day:- ");
                int day = input.nextInt();

                friend_list.addInFriendList(new Person(first_name, last_name, cell_number, month, day));
                System.out.println("\n$$ Friend added successfully $$");
            }

            else if (answer.toUpperCase().charAt(0) == 'U') {
                if (friend_list.getPerson_list().isEmpty())
                    System.out.println("hmmm..... It seems you haven't added any friends name or you don't have any..");

                else {

                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("First Name\tLast Name\t\tCellNumber\tBirthdate");
                    System.out.println("-----------------------------------------------------------------");

                    for (Person person : friend_list.getPerson_list()) {
                        System.out.println(person);
                    }
                }

            }

            else if (answer.toUpperCase().charAt(0) == 'R') {
                System.out.print("Enter person's first name:- ");
                String first_name = input.next();

                System.out.print("Enter person's last name:- ");
                String last_name = input.next();

                friend_list.remove_from_list(first_name, last_name);

                System.out.println("\n\n-----------------------------------------------------------------");
                System.out.println("First Name\tLast Name\t\tCellNumber\tBirthdate");
                System.out.println("-----------------------------------------------------------------");

                for (Person person : friend_list.getPerson_list()) {
                    System.out.println(person);
                }
            }

            else if (answer.toUpperCase().charAt(0) == 'C') {
                System.out.print("Enter cell number:- ");
                String cell_number = input.next();
                friend_list.detail_from_cell_number(cell_number);
            }

            else if (answer.toUpperCase().charAt(0) == 'D') {
                System.out.print("Enter first name:- ");
                String first_name = input.next();
                friend_list.detail_from_first_name(first_name);
            }

            else if (answer.toUpperCase().charAt(0) == 'G') {
                System.out.print("Enter last name:- ");
                String last_name = input.next();
                friend_list.detail_from_last_name(last_name);
            }

            else if (answer.toUpperCase().charAt(0) == 'H') {
                System.out.println("whoes details you want to change? enter their first name and last name bellow");
                System.out.print("Enter person's first name:- ");
                String first_name = input.next();

                System.out.print("Enter person's last name:- ");
                String last_name = input.next();

                friend_list.edit_detalis(first_name, last_name);

            }

            else if (answer.toUpperCase().charAt(0) == 'F') {
                friend_list.sortbyfirstname();
            }

            else if (answer.toUpperCase().charAt(0) == 'L') {
                friend_list.sortbylastname();
            }

            else if (answer.toUpperCase().charAt(0) == 'B') {
                System.out.print("Enter Month number:- ");
                int month2 = input.nextInt();
                friend_list.list_of_particular_born_month(month2);
            }

            else if (answer.toUpperCase().charAt(0) == 'T') {
                System.out.println("Total friends = " + friend_list.getPerson_list().size());
            }

            else if (answer.toUpperCase().charAt(0) == 'E') {
                break;
            }

        }
        input.close();
    }
}
