package ladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElementOfLadder {
    static final int RANGE = 10;
    static final int RESTRICTNUM = 4;
    private List<Boolean> elementOfLadder = new ArrayList<>();

    public void elementOfLadder(int width) {
        for (int i = 0; i < width; i++) {
            elementOfLadder.add(getRandBoolean(i));
        }
    }

    //사다리 라인 랜덤 boolean값 받기
    public boolean getRandBoolean(int now) {
        Random random = new Random();
        if ((random.nextInt(RANGE) > RESTRICTNUM) && checkDuplication(now)) {
            return true;
        }
        return false;
    }

    public boolean checkDuplication(int now) {
        if (now > 0 && elementOfLadder.get(now - 1).equals(true)) {
            return false;
        }
        return true;
    }

    public Boolean getValue(int i) {
        return elementOfLadder.get(i);
    }

    public int getElementSize() {
        return elementOfLadder.size();
    }
}
