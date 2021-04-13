package problem4;

public class BridgePatternDrive {
    public static void main(String[] args) {
        Color red = new RedColor("red");
        Shape triangle = new Triangle(red);
        Color green = new GreenColor("green");
        Shape pentagon = new Pentagon(green);

        triangle.fill();
        pentagon.fill();
    }
}
