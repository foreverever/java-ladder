package ladder.domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ElementOfLadderTest {
    @Test
    public void ElementOfLadderSizeTest() {
        ElementOfLadder elementOfLadder = new ElementOfLadder(3);
        assertThat(elementOfLadder.getElementSize()).isEqualTo(3);
    }

    @Test
    public void checkDuplicationTest() {
        List<Boolean> element = Arrays.asList(true, true, true);
        ElementOfLadder elementOfLadder = new ElementOfLadder(element);
        assertThat(elementOfLadder.checkDuplication(0)).isTrue();
        assertThat(elementOfLadder.checkDuplication(1)).isFalse();
        assertThat(elementOfLadder.checkDuplication(2)).isFalse();
    }

    @Test
    public void checkDuplicationTest2() {
        List<Boolean> element = Arrays.asList(false, false, false);
        ElementOfLadder elementOfLadder = new ElementOfLadder(element);
        assertThat(elementOfLadder.checkDuplication(0)).isTrue();
        assertThat(elementOfLadder.checkDuplication(1)).isTrue();
        assertThat(elementOfLadder.checkDuplication(2)).isTrue();
    }

    @Test
    public void getRandBooleanTest() {
        ElementOfLadder elementOfLadder = new ElementOfLadder(3);
        assertTrue(elementOfLadder.getRandBoolean(0) == true || elementOfLadder.getRandBoolean(0) == false);
    }
}