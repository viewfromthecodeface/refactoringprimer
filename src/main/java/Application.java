import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main( String[] commandLineArguments){
        new Application().run();
    }

    private void run() {
        List<Zz> zzs = new ArrayList<>();
        zzs.add(new Zz("Sue", 26));
        zzs.add(new Zz("Dave", 17));

        for ( Zz zz : zzs ){
            zz.op();
        }
    }
}
