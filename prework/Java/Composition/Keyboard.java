package Java.Composition;

class Keyboard {
     private int modelNum;
 
    // Contructor
    public Keyboard(int model){
        setModelNum(model);
    }
    // Setter
    public void setModelNum(int number) {
        this.modelNum = number;
    }
    // Getter
    public int getModelNum(){
        return this.modelNum;
    }
}
