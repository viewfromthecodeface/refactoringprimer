/**
 * Handles user data and operations
 */
public class Zz {
    private final String string;
    private final int y;

    public Zz(String string, int years) {
        this.string = string;
        this.y = years;
    }

    public void op() {
        System.out.println( "Your username is: " + string);
        System.out.println( "You are older than 18: " + (y > 18) );
    }

    public boolean trueOrFalse() {
        return y > 18;
    }
}
