package GetterSetters;

public class GettersSetters {

    public static void main(String[] args) {
        Friend friend1 = new Friend("Dario", 30, false);

        System.out.println(friend1.getName());
        System.out.println(friend1.getAge());
        System.out.println(friend1.getDate());
        System.out.println(friend1.hasWorking());
    }
    
}
