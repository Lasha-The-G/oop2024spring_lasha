import flower.HappyBoy;
import train.HappyGirl;

/**
 * Find two packages inside this package.
 * Create classes A and B inside first and the second package accordingly
 * 1 point
*/
public class Assignment02 {
    public static void main(String[] args) {
        System.out.println("This text is just for example");

        flower.HappyBoy happyBoy = new HappyBoy();
        train.HappyGirl happyGirl = new HappyGirl();

        happyGirl.out();
        happyBoy.out();
    }
}
