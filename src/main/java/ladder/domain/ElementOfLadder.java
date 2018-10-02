package ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElementOfLadder {
    static final int RANGE = 10;
    static final int RESTRICTNUM = 5;
    private List<Boolean> elementOfLadder = new ArrayList<>();
    private int width;

    public ElementOfLadder(int width) {
        this.width = width;
        for (int i = 0; i < width; i++) {
            elementOfLadder.add(getRandBoolean(i));
        }
    }

    //test용
    public ElementOfLadder(List<Boolean> elementOfLadder) {
        this.elementOfLadder = elementOfLadder;
    }

    //사다리 라인 얻기
    private boolean getRandBoolean(int current) {
        Random random = new Random();
        return ((random.nextInt(RANGE) > RESTRICTNUM) && checkDuplication(current));
    }

    //연속된 라인의 true값 중복 체크
    private boolean checkDuplication(int now) {
        return (!(now > 0 && elementOfLadder.get(now - 1)));
    }

    //라인 하나에 대해서 움직이기
    public int move(int current) {
        if (current < width && elementOfLadder.get(current)) {
            return current + 1;
        }
        //왼쪽
        if (current > 0 && elementOfLadder.get(current - 1)) {
            return current - 1;
        }
        return current;
    }

    public Boolean getValue(int i) {
        return elementOfLadder.get(i);
    }

    //테스트용
    public int getElementSize() {
        return elementOfLadder.size();
    }
}
