package ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElementOfLadder {
    static final int RANGE = 10;
    static final int RESTRICTNUM = 5;
    private List<Boolean> elementOfLadder = new ArrayList<>();

    public ElementOfLadder(int width) {
        for (int i = 0; i < width; i++) {
            elementOfLadder.add(getRandBoolean(i));
        }
    }

    public ElementOfLadder(List<Boolean> elementOfLadder) {
        this.elementOfLadder = elementOfLadder;
    }

    //사다리 라인 얻기
    public boolean getRandBoolean(int current) {
        Random random = new Random();
        return ((random.nextInt(RANGE) > RESTRICTNUM) && checkDuplication(current));
    }

    //연속된 라인의 true값 중복 체크
    public boolean checkDuplication(int now) {
        return (!(now > 0 && elementOfLadder.get(now - 1).equals(true)));
    }

    public Boolean getValue(int i) {
        return elementOfLadder.get(i);
    }

    public int getElementSize() {
        return elementOfLadder.size();
    }
}
