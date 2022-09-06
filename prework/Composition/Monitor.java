package Composition;

class Monitor {
    private int modelNum;
    private String modelName;
 
    // Contructor
    public Monitor(int model, String modelName){
        setModelNum(model);
        setModelName(modelName);
    }
    // Setter
    public void setModelNum(int number) {
        this.modelNum = number;
    }
    public void setModelName(String model) {
        this.modelName = model;
    }
    // Getter
    public int getModelNum(){
        return this.modelNum;
    }
    public String getModelName(){
        return this.modelName;
    }
}
