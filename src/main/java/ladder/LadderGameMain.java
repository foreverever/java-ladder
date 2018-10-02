package ladder;

import ladder.domain.Ladder;
import ladder.dto.DataOfLadder;
import ladder.view.ResultView;

import static ladder.view.InputView.*;

public class LadderGameMain {

    public static void main(String[] args) {
        //입력
        String[] names = getPersonNames();      //참여자 이름 받기
        String[] resultInfo = getResultInfo();  //사다리 타기 결과 받기

        //사다리 만들기
        Ladder ladder = new Ladder(names.length - 1, getLadderHeight());     //사다리 객체 만들기
        DataOfLadder ladderDto = new DataOfLadder(ladder, names, resultInfo);   //dtoladder 생성

        //사다리 정보 출력
        ResultView rv = new ResultView(ladderDto);  //dto객체를 통해 결과화면을 한번에 보여주고 싶어서 사용했다.
        rv.printAll();                              // resultview클래스는 클래스메소드로 구성되어 있기 때문에, 굳이 rv라는 참조변수를 사용하지 않아도 되는데, 만약 dto객체가 여러개이면 사용해야하는 것이 아닌가?

        //사다리 타기 결과 출력
        rv.printResultOfRidingLadder(getResultOfPeople());  //사다리 타기 결과 출력
    }
}
