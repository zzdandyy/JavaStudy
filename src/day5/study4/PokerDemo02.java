package day5.study4;

import java.util.*;

public class PokerDemo02 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm =new HashMap<>();
        ArrayList<Integer> array =new ArrayList<>();

        TreeSet<Integer> player1 =new TreeSet<>();
        TreeSet<Integer> player2 =new TreeSet<>();
        TreeSet<Integer> player3 =new TreeSet<>();
        TreeSet<Integer> other3 =new TreeSet<>();


        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2"};
        int index=0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index,color + number);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);

        Collections.shuffle(array);

        for (int i = 0; i < array.size() - 3; i++) {
            Integer poker = array.get(i);
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }
        for (int i = array.size() - 3; i < array.size(); i++) {
            Integer poker = array.get(i);
            other3.add(poker);
        }

        for (Integer integer : player1) {
            String i = hm.get(integer);
            System.out.print(i+" ");
        }
        System.out.println();
        for (Integer integer : player2) {
            String i = hm.get(integer);
            System.out.print(i+" ");
        }
        System.out.println();
        for (Integer integer : player3) {
            String i = hm.get(integer);
            System.out.print(i+" ");
        }
        System.out.println();
        for (Integer integer : other3) {
            String i = hm.get(integer);
            System.out.print(i+" ");
        }

    }
}
