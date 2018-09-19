import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ladder {
    static final int RANGE = 10;
    static final int RESTRICTNUM = 4;
    static Scanner sc = new Scanner(System.in);
    private List<String[]> ladder = new ArrayList<>();
    private int height, width;


    //참여 수
    public int getPersonNum() {
        System.out.println("참여할 사람은 몇 명 인가요?");
        return sc.nextInt();
    }

    //사다리 높이
    public void getLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        height = sc.nextInt();
    }

    //사다리 너비
    public void getLadderWidth() {
        width = (2 * getPersonNum() - 1);
    }

    //랜덤값 받기
    public int getRandNum() {
        Random random = new Random();
        return random.nextInt(RANGE);
    }

    //사다리 만들기
    public List<String[]> makeLadder() {
        initLadder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j % 2 == 0) {
                    ladder.get(i)[j] = "|";
                } else {
                    ladder.get(i)[j] = " ";
                }
            }
        }
        return ladder;
    }

    //사다리 초기화
    public void initLadder() {
        for (int i = 0; i < height; i++) {
            ladder.add(new String[width]);
        }
    }

    //사다리 라인 놓기
    public void installLine() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (ladder.get(i)[j] == " " && getRandNum() >= RESTRICTNUM) {
                    ladder.get(i)[j] = "-";
                }
            }
        }
    }

    //결과 화면 출력
    public void resultView() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(ladder.get(i)[j]);
            }
            System.out.println();
        }
    }

    //게임시작
    public static void startGame() {
        Ladder ld = new Ladder();
        ld.getLadderWidth();    //사다리 너비
        ld.getLadderHeight();   //사다리 높이
        ld.makeLadder();        //사다리 만들기
        ld.installLine();       //사다리 라인 놓기
        ld.resultView();        //결과 출력
    }

    public static void main(String[] args) {
        startGame();
    }
}
