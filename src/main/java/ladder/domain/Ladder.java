package ladder.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ladder {
    private int width;
    private List<ElementOfLadder> ladder = new ArrayList<>(); //사다리 한줄의 객체를 담는 리스트

    //사다리 만들기
    public Ladder(int width, int height) {
        this.width = width;
        for (int i = 0; i < height; i++) {
            ladder.add(new ElementOfLadder(width));
        }
    }

    //사다리 타기
    public HashMap<Integer, Integer> ride() {
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < width + 1; i++) {
            resultMap.put(i, rideOneOfPeople(i));     //출발위치,도착위치 해시맵에 저장
        }
        return resultMap;
    }

    private int rideOneOfPeople(int current) {
        for (ElementOfLadder elementOfLadder : ladder) {
            current = elementOfLadder.move(current);
        }
        return current;
    }

    public List<ElementOfLadder> getLadder() {
        return ladder;
    }

    public int getLadderSize() {
        return ladder.size();
    }
}
