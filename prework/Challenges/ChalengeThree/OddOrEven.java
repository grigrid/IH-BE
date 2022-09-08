package Challenges.ChalengeThree;

class OddOrEven {
    // private int num;

    // public OddOrEven(int num){
    //     setNum(num);
    // }

    // public void setNum(int num) {
    //     this.num = num;
    // }

    // public int getNum(){
    //     return this.num;
    // }

     public void checkOddEven(int num) { 
        if ((num % 2)== 0){
            System.out.println("The "+ num + " is an Odd number");
        } else {
            System.out.println("The "+ num + " is an Even number");
        }
    }
  
}
