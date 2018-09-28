package ladder;

import ladder.domain.ElementOfLadder;
import ladder.domain.MakingLadder;
import ladder.domain.RidingLadder;
import ladder.dto.DataOfLadder;
import java.util.List;

import static ladder.view.InputView.*;
import static ladder.view.ResultView.*;

public class LadderGameMain {

    public static void main(String[] args) {
        //입력
        String[] names = getPersonNames();      //참여자 이름 받기
        String[] resultInfo = getResultInfo();  //사다리 타기 결과 받기

        //사다리 만들기
        MakingLadder makingLadder = new MakingLadder(names.length - 1, getLadderHeight());     //사다리 객체 만들기
        List<ElementOfLadder> ladder = makingLadder.getLadder();  //사다리 만들기

        //사다리 정보 출력
        printView(names);                  //참여자 이름 출력
        printLadder(ladder);               //사다리 출력
        printView(resultInfo);             //실행결과 출력

        //사다리 타기 결과 출력
        DataOfLadder dto = new DataOfLadder(ladder, names, resultInfo);   //dtoladder 생성
        RidingLadder ridingLadder = new RidingLadder(dto);
        printResultOfRidingLadder(getResultOfPeople(), ridingLadder.rideLadder());  //사다리 타기 결과 출력
    }
}
