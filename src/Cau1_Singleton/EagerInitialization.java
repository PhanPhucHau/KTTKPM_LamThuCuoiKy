package Cau1_Singleton;

public class EagerInitialization {
    private static final  EagerInitialization INSTANCE = new EagerInitialization();

    EagerInitialization(){

    }

    public static EagerInitialization getInstance(){
        return INSTANCE;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
