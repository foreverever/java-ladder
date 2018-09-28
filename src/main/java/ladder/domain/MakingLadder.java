package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class MakingLadder {
    private List<ElementOfLadder> ladder = new ArrayList<>(); //사다리 한줄의 객체를 담는 리스트

    //사다리 만들기
    public MakingLadder(int width, int height) {
        for (int i = 0; i < height; i++) {
            ladder.add(new ElementOfLadder(width));
        }
    }

    public List<ElementOfLadder> getLadder() {
        return ladder;
    }

    public int getLadderSize() {
        return ladder.size();
    }
}
