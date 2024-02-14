public class Main {
    public static void main(String[] args) {

    Birthday bday = new Birthday(1,1,1883);
    Person person = new Person("Santhosh",bday);

    person.printData();

    }
}