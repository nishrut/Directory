public class Person {
    private String first_name;
    private String last_name;
    private String cell_number;
    private int month;
    private int day;

    public Person() {
    }

    public Person(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Person(String first_name, String last_name, String cell_number, int month, int day) {
        this(first_name, last_name);
        this.cell_number = cell_number;
        this.month = month;
        this.day = day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setCell_number(String cell_number) {
        this.cell_number = cell_number;
    }

    public String getCell_number() {
        return cell_number;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLast_name() {
        return last_name;
    }

    @Override
    public String toString() {

        return getFirst_name() + "\t\t" + getLast_name() + "\t\t\t" + getCell_number() + "\t" + getMonth() + "/"
                + getDay();
    }

}