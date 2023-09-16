import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(12);
        treeSet.add(15);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(20);
        System.out.println(getJustLarger(treeSet, 11));
        System.out.println(getJustSmaller(treeSet, 11));
    }

    public static Integer getJustLarger(TreeSet<Integer> treeSet, int data){
        // write the code to return value equal to or just larger than data
        return treeSet.higher(data);
    }

    public static Integer getJustSmaller(TreeSet<Integer> treeSet, int data){
        // write the code to return value equal to or just smaller than data
        return treeSet.lower(data);
    }

}