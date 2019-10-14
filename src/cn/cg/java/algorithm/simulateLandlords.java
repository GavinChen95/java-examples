package cn.cg.java.algorithm;

import java.util.*;

/**
 * @author: Gavin
 * @title: 模拟斗地主洗牌发牌，按照斗地主的规则，完成洗牌发牌的动作。
 * 具体规则：
 * 1.	组装54张扑克牌将
 * 2.	54张牌顺序打乱
 * 3.	三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
 * 4.	查看三人各自手中的牌（按照牌的大小排序）、底牌
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/13 23:01
 */
public class simulateLandlords {
    public static void main(String[] args) {
        /*
         * 1.组装一副牌
         * 2.洗牌
         * 3.发牌
         * 4.看牌
         * */
        //1 组牌
        //1.1 组装一副牌,使用Map存储牌的 编号 和 牌面
        Map<Integer, String> poker = new HashMap<>();

        //1.2 创建 花色 和 数字
        List<String> colors = new ArrayList<>();
        List<String> numbers = new ArrayList<>();

        //1.3 存储 花色 和 数字
        Collections.addAll(colors, "♣", "♠", "♥", "♦");
        Collections.addAll(numbers, "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");

        //1.4 设置牌的编号及大小王
        int count = 1;
        poker.put(count++, "大王");
        poker.put(count++, "小王");

        //1.5 整合54张牌牌面
        for (String color : colors
                ) {
            for (String number : numbers
                    ) {
                String card = color + number;
                poker.put(count++, card);
//              System.out.println(card);
            }
        }
//        System.out.println(poker.size());

        //2 洗牌
        //2.1 取出牌的编号key存储到set中
        Set<Integer> set = poker.keySet();
        //2.2 考虑到会用到Collections.shuffle()是list的特有方法，所以用list来接收set
        List<Integer> list = new ArrayList<>();
        list.addAll(set);
        //2.3 打乱顺序
        Collections.shuffle(list);

        // 3. 摸牌
        // 3.1 创建三个玩家
        ArrayList<Integer> noP1 = new ArrayList<Integer>();
        ArrayList<Integer> noP2 = new ArrayList<Integer>();
        ArrayList<Integer> noP3 = new ArrayList<Integer>();
        ArrayList<Integer> dipaiNo = new ArrayList<Integer>();
        // 3.2发牌的编号
        for (int i = 0; i < list.size(); i++) {
            // 获取该编号
            Integer no = list.get(i); // 发牌
            // 留出底牌
            if (i >= 51) {
                dipaiNo.add(no);
            } else {
                if (i % 3 == 0) {
                    noP1.add(no);
                } else if (i % 3 == 1) {
                    noP2.add(no);
                } else {
                    noP3.add(no);
                }
            }
        }

        // 4 查看三人各自手中的牌（按照牌的大小排序）、底牌
        // 4.1 对手中编号进行排序
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(dipaiNo);

        // 4.2 进行牌面的转换
        // 创建三个玩家牌面集合 以及底牌牌面集合
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();
        // 4.3转换
        for (Integer i : noP1) {
            // 4.4 根据编号找到 牌面 pokerMap
            String card = poker.get(i);
            // 添加到对应的 牌面集合中
            player1.add(card);
        }
        for (Integer i : noP2) {
            String card = poker.get(i);
            player2.add(card);
        }
        for (Integer i : noP3) {
            String card = poker.get(i);
            player3.add(card);
        }
        for (Integer i : dipaiNo) {
            String card = poker.get(i);
            dipai.add(card);
        }
        //4.5 查看
        System.out.println("地主：" + player1);
        System.out.println("长工：" + player2);
        System.out.println("短工：" + player3);
        System.out.println("底牌：" + dipai);
    }
}


