package day05.study4;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo01 {
    public static ArrayList<String> gameInit() {
        ArrayList<String> array = new ArrayList<>();
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");
        return array;
    }

    public static void dealCards(ArrayList<String> array, ArrayList<String> array1, ArrayList<String> array2, ArrayList<String> array3, ArrayList<String> arrayOther) {
        Collections.shuffle(array);
        for (int i = 0; i < array.size() - 3; i++) {
            String poker = array.get(i);
            if (i % 3 == 0) {
                array1.add(poker);
            } else if (i % 3 == 1) {
                array2.add(poker);
            } else {
                array3.add(poker);
            }
        }
        for (int i = array.size() - 3; i < array.size(); i++) {
            String poker = array.get(i);
            arrayOther.add(poker);
        }
    }

    public static void main(String[] args) {

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> pokerOther3 = new ArrayList<>(); //底牌

        ArrayList<String> pokers = gameInit(); //初始化
        dealCards(pokers, player1, player2, player3, pokerOther3);  //发牌


        System.out.println("玩家1 = " + player1);
        System.out.println("玩家2 = " + player2);
        System.out.println("玩家3 = " + player3);
        System.out.println("底牌 = " + pokerOther3);
    }
}
