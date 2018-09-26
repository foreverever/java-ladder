package ladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ladder.InputView.*;
import static ladder.ResultView.*;

public class MakeLadder {
    private List<ElementOfLadder> ladder = new ArrayList<>(); //사다리 한줄의 객체를 담는 리스트

    //사다리 만들기
    public void makeLadder(int width, int height) {
        for (int i = 0; i < height; i++) {
            ladder.add(new ElementOfLadder(width));
        }
    }

    public static void main(String[] args) {
        String[] names = getPersonNames();  //참여자 이름 받기
        int width = names.length - 1;   //사다리 너비
        int height = getLadderHeight(); //사다리 높이

        MakeLadder ml = new MakeLadder();     //사다리 객체 만들기
        ml.makeLadder(width, height);         //사다리 만들기
        printNames(names);                    //참여자 이름 출력
        printResult(ml.ladder);               //사다리 출력
    }
}
