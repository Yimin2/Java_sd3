package com.ll.f.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 1000);
        map.put("banana", 2000);
        map.put("cherry", 3000);
        System.out.println(map);

        int price = map.get("apple");
        System.out.println(price);

        System.out.println(map.containsKey("banana"));
        System.out.println(map.containsValue(2000));

        map.put("apple", 5000);
        System.out.println(map); // 중복 값 덮어쓰기

        map.remove("banana");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        // map.clear();
        // System.out.println(map.isEmpty());
        System.out.println(map.get("apple"));
        System.out.println(map.get("durian")); // null 반환
        System.out.println(map.getOrDefault("durian", 0)); // 없으면 설정 값 반환

        if (map.containsKey("durian")) {
            System.out.println(map.get("durian"));
        }
        map.putIfAbsent("durian", 3000); // 없으면 추가

        // key만
        for (String key : map.keySet()) {
            System.out.println(key + map.get(key));
        }

        // value 만
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // 둘다
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
