import javax.swing.plaf.PanelUI;

public class robotDemo {
    public static void main(String[] args) {
        Robot robotPetya = new Robot();
        Robot robotSiri = new Robot();
        robotPetya.robotName = "Petya";
        robotPetya.isPainter = true;
        robotPetya.model = 25;

        robotPetya.hello();
        robotPetya.greetings();
        robotSiri.robotName = "Siri";
        robotSiri.isPainter = false;
        robotSiri.model = 43;
        robotSiri.greetings();
    }

}
