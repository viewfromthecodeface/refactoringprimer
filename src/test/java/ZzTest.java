import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZzTest {

    @Test
    public void test1() {
        Zz zz = new Zz("Sue", 26);
        boolean actual = zz.trueOrFalse();
        assertThat(actual).isTrue();
    }

    @Test
    public void test2() {
        Zz zz = new Zz("Dave", 17);
        boolean actual = zz.trueOrFalse();
        assertThat(actual).isFalse();
    }
}
