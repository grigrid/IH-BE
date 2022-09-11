package Java.Super;

public class Person {
    private String name;
    private int age;

    //contructor
    public Person(String name, int age){
        setName(name);
        setAge(age);
    };
    // setters
    public void setName(String name) {
        this.name = name;     
    };
    public void setAge(int age) {
        this.age = age;
    };
    // getters
    public String getName(){
        return this.name;
    };
    public int getAge(){
        return this.age;
    };

    // methods
    public void sayHi() {
        System.out.println("Hello I'm "+ getName());
    }

};
