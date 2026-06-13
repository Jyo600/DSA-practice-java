import java.io.*;
import java.util.*;
class MyHashSet{

    private boolean[] set;

    public MyHashSet() {
        set = new boolean[1000001];
    }
    
    public void add(int key) {
        set[key] = true;
    }
    
    public void remove(int key) {
        set[key] = false;
    }
    
    public boolean contains(int key) {
        return set[key];
    }
     public static void main(String[] args) {

        MyHashSet obj = new MyHashSet();

        obj.add(1);
        obj.add(2);

        System.out.println(obj.contains(1)); // true
        System.out.println(obj.contains(3)); // false

        obj.add(2);
        System.out.println(obj.contains(2)); // true

        obj.remove(2);
        System.out.println(obj.contains(2)); // false
    }
}
