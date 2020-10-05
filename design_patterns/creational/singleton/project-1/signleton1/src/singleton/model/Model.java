package singleton.model;

public class Model implements singleton.interfaces.Model {
    private static Model singleton = null;
    private String state = null;

    private Model() {
        state = "instantiated";
    }

    public static Model getInstance() {
        if (singleton == null) {
            singleton = new Model();
        }
        return singleton;
    }

    public void printState() {
        System.out.println("state: " + singleton.state);
    }
}
