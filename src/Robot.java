public class Robot {
    String robotName;
    int model;
    boolean isPainter;

    public Robot() {}

    public Robot(String robotName, int model, boolean isPainter) {
        this.robotName = robotName;
        this.model = model;
        this.isPainter = isPainter;
    }


    public void hello() {
        System.out.println("Hello");

    }
    public void greetings() {
        System.out.println("Hello! My name is " + robotName);
        System.out.println("My model is " + model );
        System.out.println("is Painter " + isPainter );
    }

}
