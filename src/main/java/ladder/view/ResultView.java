package ladder.view;

import ladder.domain.ElementOfLadder;

import java.util.List;

import static ladder.view.InputView.*;

public class ResultView {

    //이름 출력
    public static void printNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            arrangeNameSpace(names, i);
        }
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
        }
        System.out.println();
    }

    //이름 간격 맞추기
    public static void arrangeNameSpace(String[] names, int i) {
        while (names[i].length() <= RESTRICT_NAME_RANGE) {
            names[i] = " " + names[i];
        }
    }

    //사다리 출력
    public static void printResult(List<ElementOfLadder> ladders) {
        for (int i = 0; i < ladders.size(); i++) {
            System.out.print("     |");
            drawOneElementOfLadder(ladders, i);
            System.out.println();
        }
    }

    public static void drawOneElementOfLadder(List<ElementOfLadder> ladders, int n) {
        for (int i = 0; i < ladders.get(n).getElementSize(); i++) {
            System.out.print(installLine(ladders.get(n).getValue(i)));
            System.out.print("|");
        }
    }

    public static String installLine(boolean bool) {
        if (bool) {
            return "-----";
        }
        return "     ";
    }
}
