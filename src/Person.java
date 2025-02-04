public class Person {
    private String name;
    private String firstName;
    public int age;

    public Person(String ln, String fn){
        name = ln;
        firstName = fn;
    }
    public Person(){
    }

    public void setName(String ln, String fn) {
        this.name = name;
    }

    public String fullName(){
        return name + " " + firstName;
    }
}