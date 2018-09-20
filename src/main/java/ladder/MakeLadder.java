package ladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ladder.InputView.*;
import static ladder.ResultView.*;

public class MakeLadder {
    static Scanner sc = new Scanner(System.in);
    private List<ElementOfLadder> ladder = new ArrayList<>(); //사다리 한줄의 객체를 담는 리스트

    //사다리 만들기
    public void makeLadder(int width, int height) {
        for (int i = 0; i < height; i++) {
            ladder.add(new ElementOfLadder());
            ladder.get(i).elementOfLadder(width);
        }
    }

    public static void main(String[] args) {
        int width = getLadderWidth();   //너비 받기
        int height = getLadderHeight(); //높이 받기

        MakeLadder ml = new MakeLadder();     //사다리 객체 만들기
        ml.makeLadder(width, height);          //사다리 만들기
        printResult(ml.ladder);               //사다리 출력
    }
}
