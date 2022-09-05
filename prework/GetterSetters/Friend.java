package GetterSetters;

import java.util.Date;

class Friend {
    private String name;
    private Date birthday;
    private int age;
    private boolean working;

    // constructor
    public Friend(String nombre, Date cumple, int edad, boolean trabaja){
        setName(nombre);
        setBirthday(cumple);
        setAge(edad);
        this.working = true;
    }
    //setters
    public void setName(String nombre) {
        this.name = nombre;
    }
    public void setBirthday(Date cumple) {
        this.birthday = cumple;
    }
    public void setAge(int edad) {
        this.age = edad;
    }
    public void working(boolean trabaja) {
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
    public boolean getWorking(){
        return this.working;
    }

}
