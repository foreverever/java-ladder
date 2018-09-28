package ladder.domain;

import ladder.dto.DataOfLadder;

import java.util.HashMap;

public class RidingLadder {
    private DataOfLadder dto;

    public RidingLadder(DataOfLadder dto) {
        this.dto = dto;
    }

    public HashMap<String, String> rideLadder() {
        HashMap<String, String> resultMap = new HashMap<>();
        for (int i = 0; i < dto.getNames().length; i++) {
            int current = i;
            current = ridingOneOfPeople(current);
            resultMap.put(dto.getNames()[i], dto.getResultInfo()[current]);
        }
        return resultMap;
    }

    public int ridingOneOfPeople(int current) {
        for (int j = 0; j < dto.getLadder().size(); j++) {
            current = decideDirection(current, j);
        }
        return current;
    }

    public int decideDirection(int current, int j) {
        //오른쪽
        if (current < dto.getNames().length - 1 && dto.getLadder().get(j).getValue(current).equals(true)) {
            return current + 1;
        }
        //왼쪽
        if (current > 0 && dto.getLadder().get(j).getValue(current - 1).equals(true)) {
            return current - 1;
        }
        return current;
    }
}
