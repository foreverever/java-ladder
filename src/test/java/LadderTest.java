import ladder.MakeLadder;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LadderTest {
    MakeLadder ladder;

    @Before
    public void setUp() {
        ladder = new MakeLadder();
    }

    @Test
    public void strTest() {
        String str = "abcd";
        String str2 = "abcd";
        String str3 = new String("abcd");
        assertThat(str == str2).isEqualTo(str.equals(str2));  //리턴값이 둘다 true니 참이 맞음
        assertThat(str == str2).isEqualTo(true);  //근데 왜 str==str2가 리턴값이 true냐 이거지.. 주소값이 다를텐데--> 같다
        assertThat(str == str3).isEqualTo(true);
    }
}