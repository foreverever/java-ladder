package ladder.domain;

import ladder.dto.DataOfLadder;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class RidingLadderTest {
    List<ElementOfLadder> ladders;
    String[] names = {"pobi", "honux", "for", "jk"};
    String[] resultInfo = {"꽝", "1000", "2000", "500"};

    @Before
    public void SetUp() {
        ladders = new ArrayList<>();
        List<Boolean> element = Arrays.asList(true, false, true);
        ElementOfLadder elementOfLadder = new ElementOfLadder(element);
        ladders.add(elementOfLadder);

        List<Boolean> element2 = Arrays.asList(false, true, false);
        ElementOfLadder elementOfLadder2 = new ElementOfLadder(element2);
        ladders.add(elementOfLadder2);

        List<Boolean> element3 = Arrays.asList(true, false, false);
        ElementOfLadder elementOfLadder3 = new ElementOfLadder(element3);
        ladders.add(elementOfLadder3);
    }

    @Test
    public void ridingLadderTest() {
        HashMap<String, String> resultMap;
        DataOfLadder dto = new DataOfLadder(ladders, names, resultInfo);
        RidingLadder rl = new RidingLadder(dto);
        resultMap = rl.rideLadder();

        for (int i = 0; i < ladders.size(); i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ladders.get(i).getValue(j) + " ");
            }
            System.out.println();
        }
        System.out.println();

        Iterator<String> keySetIterator = resultMap.keySet().iterator();
        while (keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            System.out.println(key + " : " + resultMap.get(key));
        }
    }
}
