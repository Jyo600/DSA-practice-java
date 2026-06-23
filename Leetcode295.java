//leetcode 295
import java.util.*;
import java.io.*;
class MedianFinder {
PriorityQueue<Integer> minheap;
PriorityQueue<Integer> maxheap;

public MedianFinder() {
    maxheap = new PriorityQueue<>((a, b) -> b - a);
    minheap = new PriorityQueue<>();
}
public void addNum(int num) {
maxheap.add(num);
    minheap.add(maxheap.poll());
    if (minheap.size() > maxheap.size()) {
        maxheap.add(minheap.poll());
    }
}
public double findMedian() {
    if (minheap.size() == maxheap.size()) {
        return (maxheap.peek() + minheap.peek()) / 2.0;
    }
    return maxheap.peek();
}
}
public class Leetcode295 {
public static void main(String[] args) {

    MedianFinder mf = new MedianFinder();

    mf.addNum(1);
    System.out.println("Median = " + mf.findMedian());

    mf.addNum(2);
    System.out.println("Median = " + mf.findMedian());

    mf.addNum(3);
    System.out.println("Median = " + mf.findMedian());

    mf.addNum(4);
    System.out.println("Median = " + mf.findMedian());

    mf.addNum(5);
    System.out.println("Median = " + mf.findMedian());
}
}
