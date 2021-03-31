import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FriendList {
    private ArrayList<Person> person_list;
    private ArrayList<String> sorted_names = new ArrayList<>();

    public FriendList() {
        person_list = new ArrayList<Person>();
    }

    public void setPerson_list(ArrayList<Person> person_list) {
        this.person_list = person_list;
    }

    public ArrayList<Person> getPerson_list() {
        return person_list;
    }

    public ArrayList<String> getSorted_names() {
        return sorted_names;
    }

    public void addInFriendList(Person p) {
        this.person_list.add(p);
    }



    // ! sorting by last name
    public void sortbylastname() {
        ArrayList<Person> tempList_arraylist = new ArrayList<>(person_list);

        System.out.println("\n\nFriends list sorted by last name:-");
        for (Person person : person_list) {
            sorted_names.add(person.getLast_name().toUpperCase());
            // person.getLast_name();
        }
        Collections.sort(sorted_names);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("First Name\tLast Name\t\tCellNumber\tBirthdate");
        System.out.println("-----------------------------------------------------------------");
        int x = 0;
        for (String string : sorted_names) {
            x = 0;
            for (Person person : tempList_arraylist) {
                if (string.equals(person.getLast_name().toUpperCase())) {
                    System.out.println(person);
                    tempList_arraylist.remove(x);
                    x++;
                    break;
                }
                x++;
            }
        }
        sorted_names.clear();

    }

    // ! Sorting by first name
    public void sortbyfirstname() {
        ArrayList<Person> tempList_arraylist = new ArrayList<>(person_list);


        System.out.println("\n\nFriends list sorted by first name:-");
        for (Person person : person_list) {
            sorted_names.add(person.getFirst_name().toUpperCase());
            // person.getFirst_name();
        }
        Collections.sort(sorted_names);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("First Name\tLast Name\t\tCellNumber\tBirthdate");
        System.out.println("-----------------------------------------------------------------");
        int x = 0;
        for (String string : sorted_names) {
            x = 0;
            for (Person person : tempList_arraylist) {
                if (string.equals(person.getFirst_name().toUpperCase())) {
                    System.out.println(person);
                    tempList_arraylist.remove(x);
                    x++;
                    break;
                }
                x++;
            }
        }
        sorted_names.clear();

    }

    // ! printing particular month born person list
    public void list_of_particular_born_month(int month) {
        if (month == 1)
            System.out.println("\n\nFriends list who are born in January:- ");
        else if (month == 2)
            System.out.println("\n\nFriends list who are born in February:- ");
        else if (month == 3)
            System.out.println("\n\nFriends list who are born in March:- ");
        else if (month == 4)
            System.out.println("\n\nFriends list who are born in April:- ");
        else if (month == 5)
            System.out.println("\n\nFriends list who are born in May:- ");
        else if (month == 6)
            System.out.println("\n\nFriends list who are born in June:- ");
        else if (month == 7)
            System.out.println("\n\nFriends list who are born in July:- ");
        else if (month == 8)
            System.out.println("\n\nFriends list who are born in August:- ");
        else if (month == 9)
            System.out.println("\n\nFriends list who are born in September:- ");
        else if (month == 10)
            System.out.println("\n\nFriends list who are born in October:- ");
        else if (month == 11)
            System.out.println("\n\nFriends list who are born in November:- ");
        else if (month == 12)
            System.out.println("\n\nFriends list who are born in December:- ");

        System.out.println("-----------------------------------------------------------------");
        System.out.println("First Name\tLast Name\t\tCellNumber\tBirthdate");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 1; i <= 31; i++) {
            for (Person person : this.person_list) {
                if (person.getMonth() == month) {
                    if (i == person.getDay())
                        System.out.println(person);
                }
            }
        }
    }

    // ! removing from list
    public void remove_from_list(String first_name, String last_name) {

        int x = 0;
        for (Person person : this.person_list) {
            if (person.getFirst_name().equalsIgnoreCase(first_name)
                    && person.getLast_name().equalsIgnoreCase(last_name))
                break;
            x++;
        }
        
        if (x >= 0 && x < person_list.size()) {
            person_list.remove(x);
            System.out.println("\n$$ Removed Successfully $$");
        }

        else {
            System.out.println("\n\n!!It seems you dont have any friend whose name is " + first_name + " " + last_name);
        }
    }

    // ! detail from cell number
    public void detail_from_cell_number(String cell_number) {
        int x = 0;
        System.out.println("-----------------------------------------------------------------");
        System.out.println("First Name\tLast Name\t\tCellNumber\tBirthdate");
        System.out.println("-----------------------------------------------------------------");

        for (Person person : this.person_list) {
            if (person.getCell_number().equalsIgnoreCase(cell_number)) {
                System.out.println(person);
                x++;
            }
        }
        if (x == 0)
            System.out.println("hmm.. It seems you don't have any friend with cell number " + cell_number);
    }

    // ! detail from first name
    public void detail_from_first_name(String first_name) {
        int x = 0;
        System.out.println("-----------------------------------------------------------------");
        System.out.println("First Name\tLast Name\t\tCellNumber\tBirthdate");
        System.out.println("-----------------------------------------------------------------");

        for (Person person : this.person_list) {
            if (person.getFirst_name().equalsIgnoreCase(first_name)) {
                System.out.println(person);
                x++;
            }
        }
        if (x == 0)
            System.out.println("hmm.. It seems you don't have any friend with name " + first_name);
    }

    // ! detail from last name
    public void detail_from_last_name(String l_name) {
        int x = 0;
        System.out.println("-----------------------------------------------------------------");
        System.out.println("First Name\tLast Name\t\tCellNumber\tBirthdate");
        System.out.println("-----------------------------------------------------------------");

        for (Person person : this.person_list) {
            if (person.getLast_name().equalsIgnoreCase(l_name)) {
                System.out.println(person);
                x++;
            }
        }
        if (x == 0)
            System.out.println("hmm.. It seems you don't have any friend with name " + l_name);

    }

    // ! editing person's detail
    public void edit_detalis(String first_name, String last_name) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        for (Person person : this.person_list) {
            if (person.getFirst_name().equalsIgnoreCase(first_name)
                    && person.getLast_name().equalsIgnoreCase(last_name)) {

                while (true) {

                    System.out.println(
                            "\n\n------------------------------Enter your choice-------------------------------");
                    System.out
                            .println("Edit first name(F), last name(L), cell number(C), birth month(M), birth day(D)");
                    String choice = in.next();

                    if (choice.toUpperCase().charAt(0) == 'F') {
                        System.out.println("Current first name:- " + person.getFirst_name());
                        System.out.print("Enter new first name:- ");
                        String new_first_name = in.next();
                        person.setFirst_name(new_first_name);
                        System.out.println("\n$ Details updated $\n");
                    }

                    else if (choice.toUpperCase().charAt(0) == 'L') {
                        System.out.println("Current last name:- " + person.getLast_name());
                        System.out.print("Enter new last name:- ");
                        String new_last_name = in.next();
                        person.setLast_name(new_last_name);
                        System.out.println("\n$ Details updated $\n");
                    }

                    else if (choice.toUpperCase().charAt(0) == 'C') {
                        System.out.println("Current Cell number:- " + person.getCell_number());
                        System.out.print("Enter new Cell number:- ");
                        String new_cell = in.next();
                        person.setCell_number(new_cell);
                        System.out.println("\n$ Details updated $\n");
                    }

                    else if (choice.toUpperCase().charAt(0) == 'M') {
                        System.out.println("Current birth month:- " + person.getMonth());
                        System.out.print("Enter new birth month:- ");
                        int month = in.nextInt();
                        person.setMonth(month);
                        System.out.println("\n$ Details updated $\n");
                    }

                    else if (choice.toUpperCase().charAt(0) == 'D') {
                        System.out.println("Current birth day:- " + person.getDay());
                        System.out.print("Enter new birth day:- ");
                        int day = in.nextInt();
                        person.setDay(day);
                        System.out.println("\n$ Details updated $\n");
                    }
                    x++;
                    System.out.print(
                            "Do you want to update anything else in the current person? enter 'Y' else enter 'N':- ");
                    String ch = in.next();
                    if (ch.toUpperCase().charAt(0) != 'Y')
                        break;
                }
            }
        }
        if (x == 0)
            System.out.println("\nhmm.. It seems you dont have any friend with the above details");
    }

}
