package ladder;

import java.util.Scanner;

public class InputView {
    static Scanner sc = new Scanner(System.in);
    static final int RESTRICT_NAME_RANGE = 5;

    //참여자 이름 받기
    public static String[] getPersonNames() {
        System.out.println("참여할 사람 이름을 입력하세요 (이름은 쉼표(,)로 구분하세요.)");
        String[] names = sc.nextLine().split(",");
        while (isNotRightNamesRange(names)) {
            System.out.println("이름을 잘못 입력하셨습니다.(한 사람당 5글자 이내로 입력해주세요.)");
            System.out.println("참여할 사람 이름을 입력하세요 (이름은 쉼표(,)로 구분하세요.)");
            names = sc.nextLine().split(",");
        }
        return names;
    }

    //이름 글자 수 체크
    public static boolean isNotRightNamesRange(String[] names) {
        int errorNum = 0;
        for (int i = 0; i < names.length; i++) {
            errorNum += checkNameRange(names, i);
        }
        return errorNum > 0;
    }

    //이름 글자 수 체크2
    public static int checkNameRange(String[] names, int i) {
        if (names[i].length() > RESTRICT_NAME_RANGE) {
            return 1;
        }
        return 0;
    }

    //사다리 높이
    public static int getLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return sc.nextInt();
    }
}
