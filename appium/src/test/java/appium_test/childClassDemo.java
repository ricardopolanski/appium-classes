package appium_test;

public class childClassDemo extends parentClassDemo {
    public void Engine() {
        System.out.println("new engine");
    }
    public void colour() {
        System.out.println(colour);
        
    }
    public static void main(String[] args) {
        childClassDemo cd = new childClassDemo();
        cd.colour();
    }

}
