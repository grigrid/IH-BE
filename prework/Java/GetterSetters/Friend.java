package Java.GetterSetters;
//import java util Date to access
import java.util.Date;

class Friend {
    private String name;
    private int age;
    private Date birthday;
    private boolean working;

    // constructor
    public Friend(String nombre, int edad){
        setName(nombre);
        setAge(edad);
        this.birthday = new Date();
        this.working = true;
    }
    public Friend(String nombre, int edad, boolean work){
        setName(nombre);
        setAge(edad);
        this.birthday = new Date();
        setWorking(work);
    }
    //setters
    public void setName(String nombre) {
        this.name = nombre;
    }
    // public void setBirthday(Date cumple) {
    //     this.birthday = cumple;
    // }
    public void setAge(int edad) {
        this.age = edad;
    }
    public void setWorking(boolean trabaja) {
        this.working = trabaja;
    }
    //getters
    public String getName(){
        return this.name;
    }
    public Date getDate(){
        return this.birthday;
    }
    public int getAge(){
        return this.age;
    }
    // we use has or is in boolean getters
    public boolean hasWorking(){
        return this.working;
    }

}
