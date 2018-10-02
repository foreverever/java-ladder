package ladder.dto;

import ladder.domain.ElementOfLadder;
import ladder.domain.Ladder;

import java.util.HashMap;
import java.util.List;

public class DataOfLadder {
    private Ladder ladder;
    private String[] names, resultInfo;

    public DataOfLadder(Ladder ladder, String[] names, String[] resultInfo) {
        this.ladder = ladder;
        this.names = names;
        this.resultInfo = resultInfo;
    }

    public List<ElementOfLadder> getLadder() {
        return ladder.getLadder();
    }

    public String[] getNames() {
        return names;
    }

    public int getWidth() {
        return names.length;
    }

    public int getHeight() {
        return ladder.getLadderSize();
    }

    public String[] getResultInfo() {
        return resultInfo;
    }

    public HashMap<Integer, Integer> getResultMap() {
        return ladder.ride();
    }

    //해시맵 인덱스값
    public int getResultIndex(int index) {
        return ladder.ride().get(index);
    }

    //사다리 라인의 요소값 리턴(ladderIndex 번째 라인의 elementIndex 번째 값 반환
    public boolean getElementValue(int ladderIndex, int elementIndex){
        return ladder.getLadder().get(ladderIndex).getValue(elementIndex);
    }

    public int sizeOfElement(){
        return names.length-1;
    }
}
