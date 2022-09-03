class Methods {
// public - the public keyword is an access modifier. Access modifiers determine where this method can be called from. The public access modifier means that the main method can be called from anywhere in the program. 
// static -  the static keyword indicates that the main method exists on the class rather than on an object created from the class. When we come to the basics of Object-oriented programming, this will become more clear.
// void - this is the return type. Every method signature requires a return type (there are some exceptions that we going to cover later). Since the main method does not return any value, its return type is void.
// main - this is the name of the method. In general, you can name your methods anything you like, but the main method has a specific naming convention. 
// String[] args - this is the parameter list. In the case of the main method, it accepts an array of Strings as its only parameter.
// Access modifier => public(Can access from other methods and inside the one), private (Only available in the main class), protected
    public static void main(String[] args) {
        String fullName = getFullName("Yehosua", "Escobedo");
        System.out.println(fullName);
    }

    public static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}