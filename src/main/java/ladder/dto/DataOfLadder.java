package ladder.dto;

import ladder.domain.ElementOfLadder;

import java.util.List;

public class DataOfLadder {
    private List<ElementOfLadder> ladder;
    private String[] names, resultInfo;

    public DataOfLadder(List<ElementOfLadder> ladder, String[] names, String[] resultInfo) {
        this.ladder = ladder;
        this.names = names;
        this.resultInfo = resultInfo;
    }

    public List<ElementOfLadder> getLadder() {
        return ladder;
    }

    public String[] getNames() {
        return names;
    }

    public String[] getResultInfo() {
        return resultInfo;
    }
}
