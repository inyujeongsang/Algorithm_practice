package topic01_01;

import java.util.Scanner;

public class Main {
    public static int solution(String str, char t){//프로그래머스방식
        int answer = 0;
        str = str.toUpperCase(); //문자 스타일 대문자로 통일.
        t = Character.toUpperCase(t);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {//문자열을 인덱스로 접근하려면 charAt을 써야함.
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);//문자를 인덱스로 가져옴.

        System.out.print(T.solution(str,c));
    }
}
