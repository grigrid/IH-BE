package Java.Super;

class Employee  extends Person{
    private String title;

    public Employee(String name, int age, String title){
        super(name, age);
        setTitle(title);
    };
    // setters
    public void setTitle(String title) {
        this.title = title;
    };
    // getters
    public String getTitle() {
        return this.title;
    };

    // Methods
    public void sayHi() {
        // the methods should call with dot after super word
        super.sayHi();
        System.out.println("My title is " + this.title);
        
    }
}
