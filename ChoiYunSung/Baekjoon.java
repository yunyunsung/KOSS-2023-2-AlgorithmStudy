import java.util.*;

public class Baekjoon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean t = true;
        Stack<String> s = new Stack();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '<') {
                t = false;
                if(!s.empty()){
                    while (!s.empty()) { //실수한 부분 1
                        System.out.print(s.pop());
                    }
                }
            }


            if (t && S.charAt(i) != ' ') {
                s.push(String.valueOf(S.charAt(i)));
            }
            else if (t && (S.charAt(i) == ' ')) {
                while (!s.empty()) { //실수한 부분 1
                    System.out.print(s.pop());
                }
                System.out.print(" ");
            }


            if (!t) {
                System.out.print(S.charAt(i));
            }
            if (S.charAt(i) == '>') {
                t = true;
            }

        }//for문 닫기
        while (!s.empty()) { //실수한 부분 2
            System.out.print(s.pop()); //마무리로 비우기
        }
    }
}