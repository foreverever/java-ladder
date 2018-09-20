package ladder;

import java.util.Scanner;

public class InputView {
    static Scanner sc = new Scanner(System.in);

    //참여 수
    public static int getPersonNum() {
        System.out.println("참여할 사람은 몇 명 인가요?");
        return sc.nextInt();
    }

    //사다리 높이
    public static int getLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return sc.nextInt();
    }

    //사다리 너비
    public static int getLadderWidth() {
        return getPersonNum() - 1;
    }
}
