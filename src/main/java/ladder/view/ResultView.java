package ladder.view;

import ladder.domain.ElementOfLadder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ResultView {

    //이름 출력
    public static void printView(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.print(String.format("%6s", names[i]));
        }
        System.out.println();
    }

    //사다리 출력
    public static void printLadder(List<ElementOfLadder> ladders) {
        for (int i = 0; i < ladders.size(); i++) {
            System.out.print("     |");
            drawOneElementOfLadder(ladders, i);
            System.out.println();
        }
    }

    //사다리 타기 결과 출력
    public static void printResultOfRidingLadder(String name, HashMap<String, String> resultMap) {
        if (name.equals("all")) {
            showAllResult(resultMap);
        } else {
            System.out.println(resultMap.get(name));
        }
    }

    public static void showAllResult(HashMap<String, String> resultMap) {
        Iterator<String> keySetIterator = resultMap.keySet().iterator();
        while (keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            System.out.println(key + " : " + resultMap.get(key));
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