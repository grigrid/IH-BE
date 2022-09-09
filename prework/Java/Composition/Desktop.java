package Java.Composition;

class Desktop {
    private String modelName;
    private Monitor monitor; 
    private Keyboard keyboard; 
    private Tower tower; 

    // constructor
    public Desktop( String modelName, Monitor monitor, Keyboard keyboard, Tower tower){
        setModelName(modelName);
        setMonitor(monitor);
        setKeyboard(keyboard);
        setTower(tower);
    }
    // Setters
    public void setModelName(String name){
        this.modelName = name;
    }
    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }
    public void setKeyboard(Keyboard keyboard){
        this.keyboard = keyboard;
    }
    public void setTower(Tower tower){
        this.tower = tower;
    }
    // Getters
    public String getModelName() {
        return this.modelName;
    }
    public Monitor  getMonitor(){
        return this.monitor;
    }
    public Keyboard getKeyboard() {
        return this.keyboard;
    }
    public Tower getTower() {
        return this.tower;
    }

}
