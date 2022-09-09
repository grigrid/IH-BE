package Java.Composition;

class Tower {
    private int modelNum;
    // Contructor
    public Tower(int modelNum) {
        setModelNum(modelNum); 
    }
    // Setter
    public void setModelNum(int num) {
        this.modelNum = num;
    }
    // Getter
    public int getModelNum(){
        return this.modelNum;
    }
}
