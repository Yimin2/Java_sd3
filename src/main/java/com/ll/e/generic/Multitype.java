package com.ll.e.generic;

import com.ll.a.basic.Practice2;
import com.ll.d.inheritance.InterfaceMain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
class Pair<K, V> {
    private K k;
    private V value;

    @Override
    public String toString() {
        return "Pair{" + "k=" + k + ", value=" + value + '}';
    }

}

public class Multitype {
    public static void main(String[] args) {
        Pair<String, String> p1 = new Pair<String, String>("name", "kim");
        System.out.println(p1);

        Pair<String, Integer> p2 = new Pair<String, Integer>("age", 123);
        System.out.println(p2);
    }
}
