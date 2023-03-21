package homework_projects;

/**
 * 14. Person
 * Write a class with the name Person. The class needs three fields (instance variables) with the names
 * firstName, lastName of type String and age of type int.
 */
public class Programme14 {
    // instance variable
    String firstName, lastName;
    int age;

    //get firstname method
    public String getFirstName() {
        return firstName;
    }

    //get lastname method
    public String getLastname() {
        return lastName;
    }
    //get age method with return type

    public int getAge() {
        return age;
    }

    //set firstname method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //set lastname method
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //set age method
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
        } else {
            this.age = age;
        }
    }

    //check is it teen or not
    public boolean IsTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        } else {
            return false;
        }
    }

    //get full name method
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return getLastname();
        } else if (lastName.isEmpty()) {
            return getFirstName();
        } else {
            return getFirstName() + " " + getLastname();

        }
    }

    //main method
    public static void main(String[] args) {

        Programme14 person = new Programme14();
        person.setFirstName(""); //firstname is set to empty string
        person.setLastName("");  //lastname is set to empty string
        person.setAge(10);
        System.out.println("full Name= " + person.getFullName());
        System.out.println("teen = " + person.IsTeen());
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen = " + person.IsTeen());
        person.setLastName("Smith");// last name is set to smith
        System.out.println("fullName = "  + person.getFullName());
    }

}