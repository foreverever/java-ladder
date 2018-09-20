package ladder;

import java.util.List;

public class ResultView {

    //화면 출력
    public static void printResult(List<ElementOfLadder> ladders) {
        for (int i = 0; i < ladders.size(); i++) {
            System.out.print("|");
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
            return "-";
        }
        return " ";
    }
}
