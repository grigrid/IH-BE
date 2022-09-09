package Java.Super;

class Super {
    public static void main(String[] args) {
        Person person1 = new Person("Fran", 25);
        Employee employee1 = new Employee("Yehosua", 30, "UI developer");

        System.out.println(person1.getName());
        System.out.println(employee1.getName());
        person1.sayHi();
        employee1.sayHi();
    }
    
}
