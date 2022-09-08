package Challenges.ChallengeTwo;

public class SwitchCase {

    public String printNumberInWord(int num) {
        String result;
        switch(num){
            case 0: 
                System.out.println("CERO" );
                result = "CERO";
            break; 
            case 1: 
                System.out.println("ONE" );
                result = "ONE";
            break; 
            case 2: 
                System.out.println("TWO");
                result = "TWO";
            break; 
            case 3: 
                System.out.println("THREE");
                 result = "THREE";
            break; 
            case 4: 
                System.out.println("FOUR"); 
                 result = "FOUR";
            break;
            case 5: 
                System.out.println("FIVE"); 
                 result = "FOUR";
            break;
            case 6: 
                System.out.println("SIX"); 
                 result = "FOUR";
            break;
            case 7: 
                System.out.println("SEVEN"); 
                 result = "FOUR";
            break;
            case 8: 
                System.out.println("EIGHT"); 
                 result = "FOUR";
            break;
            case 9: 
                System.out.println("NINE"); 
                 result = "FOUR";
            break;
            default:
                System.out.println("MORE THAN NINE" );
                 result = "MORE THAN NINE";
            break;
        }
        return result;
    }
}
