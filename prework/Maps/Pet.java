package Maps;

class Pet {
    private String name;
    private int age;
// Contrsutor
    public Pet(String name, int age) {
        setName(name);
        setAge(age);
    }
// Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
// Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    } 
}
