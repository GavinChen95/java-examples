package cn.cg.java.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: Gavin
 * @title: 计算一个字符串中每个字符出现次数。
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/13 22:29
 */
public class TimesOfStrings {
    public static void main(String[] args) {
        String str = "asasdsaaassdsds";
        //将字符串中每个字符存入char数组
        char[] chars = str.toCharArray();
        //使用Map集合，键是字符，值是字符出现的次数
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                //字符第一次出现记录一次
                map.put(chars[i], 1);
            } else {
                //字符多次出现，先获取之前的出现的次数（值），再自增一次
                int count = map.get(chars[i]);
                map.put(chars[i], ++count);
            }
        }

        System.out.println(map);
        //使用Entry分别获取键、值，回答问题
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet
                ) {
            System.out.println("字符" + entry.getKey() + "出现的次数是" + entry.getValue() + "次");
        }

    }

}
