package ladder.view;

import ladder.dto.DataOfLadder;

import java.util.Iterator;

public class ResultView {
    private DataOfLadder dto;

    public ResultView(DataOfLadder dto) {
        this.dto = dto;
    }

    public void printAll() {
        printNames();
        printLadder();
        printResult();
    }

    //이름 출력
    private void printNames() {
        for (int i = 0; i < dto.getWidth(); i++) {
            System.out.print(String.format("%6s", dto.getNames()[i]));
        }
        System.out.println();
    }

    //결과 출력
    private void printResult() {
        for (int i = 0; i < dto.getWidth(); i++) {
            System.out.print(String.format("%6s", dto.getResultInfo()[i]));
        }
        System.out.println();
    }

    //사다리 출력
    private void printLadder() {
        for (int i = 0; i < dto.getHeight(); i++) {
            System.out.print("     |");
            drawOneElementOfLadder(i);
            System.out.println();
        }
    }

    //사다리 타기 결과 출력
    public void printResultOfRidingLadder(String name) {
        if (name.equals("all")) {
            showAllResult();
        }
        for (int i = 0; i < dto.getNames().length; i++) {
            if (name.equals(dto.getNames()[i])) {
                System.out.println(dto.getResultInfo()[dto.getResultIndex(i)]);
            }
        }
    }

    private void showAllResult() {
        Iterator<Integer> keySetIterator = dto.getResultMap().keySet().iterator();
        while (keySetIterator.hasNext()) {
            Integer key = keySetIterator.next();
            System.out.println(dto.getNames()[key] + " : " + dto.getResultInfo()[dto.getResultIndex(key)]);
        }
    }

    private void drawOneElementOfLadder(int n) {
        for (int i = 0; i < dto.sizeOfElement(); i++) {
            System.out.print(installLine(dto.getElementValue(n, i)));
            System.out.print("|");
        }
    }

    private String installLine(boolean bool) {
        if (bool) {
            return "-----";
        }
        return "     ";
    }
}