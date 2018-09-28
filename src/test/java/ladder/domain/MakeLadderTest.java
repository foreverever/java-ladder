package ladder.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.Test;

public class MakeLadderTest {
    @Test
    public void makeLadderTest() {
        MakingLadder makeLadder = new MakingLadder(3, 5);
        assertThat(makeLadder.getLadderSize()).isEqualTo(5);
    }
}
