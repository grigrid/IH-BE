public class Main {

    public static void main(String[] args) {

        /*int intPrimitivo = 123;
        Integer intWrapper = 1;

        float float1= 12.26f;

        int num1 = 300;

//        System.out.println(num1 / 40);

        int num2 = 7;
        int num3 = 4;*/
        // hay que castear con (double) para que no tronque el numero
//        double division = (double)num2 / num3;
//        System.out.println(division);
        String product = "    Tapacubos para   coche ";
        String date = "12/08/2022";
        System.out.println(productForMatter(product, date));

    }

    private static String productForMatter(String productName, String date){
        String productClean = productName.trim().replaceAll("\\s+","_");

        return  productClean + "-" + date;
    }

}
