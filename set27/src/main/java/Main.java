import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(concat(getName(),getName()));

        Scanner scanner = new Scanner(System.in);
        String nameCompleto;
        boolean isCorrect = false;
        /*while (!isCorrect) {
                System.out.println("Por favor, introduce tu nombre");
                String nameInput = scanner.nextLine();
                System.out.println("Por favor, introduce tu appellido");
                String lastNameInput = scanner.nextLine();
            try {
                System.out.println(concantString(nameInput, lastNameInput));
                isCorrect = true;
            } catch (IllegalArgumentException e) {
                System.err.println("ERROR\n" + e.getMessage());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }*/
    }





    public static String readAndValidateName() throws IllegalArgumentException {
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();
        if (result.isBlank()) throw new IllegalArgumentException("No has introducido una cadena valida");

        return result;
    }

    public static String getName() {
        boolean isCorrect = true;
        String name = null;
        System.out.println("Introduce un nombre");
        while (isCorrect) {
            try {
                name = readAndValidateName();
                isCorrect = false;
            } catch (IllegalArgumentException e) {
                System.err.println("No has introducido correctamente el nombre, vuelvelo a introducir");
            }
        }
        return name;
    }

    public static String concat(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

  /*  public static String concantString(String name, String lastName) throws Exception {
        if (name.isBlank() || name == null){
            throw new IllegalArgumentException("You need to complete the field name");
        }
        if(lastName.isBlank() || lastName == null){
            throw new IllegalArgumentException("You need to complete the field last name");
        }
        return name + " " + lastName;
    }*/

}
