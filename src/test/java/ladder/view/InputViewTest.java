package ladder.view;

import org.junit.Test;

import static ladder.view.InputView.checkNameRange;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InputViewTest {
    @Test
    public void checkNameRangeTest() {
        String[] names = {"pobi", "forever", "jk"};
        assertThat(checkNameRange(names, 0)).isEqualTo(0);
        assertThat(checkNameRange(names, 1)).isEqualTo(1);
        assertThat(checkNameRange(names, 2)).isEqualTo(0);
    }
}
