package Composition;

class Monitor {
    private int modelNum;
 
    // Contructor
    public Monitor(int model){
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
