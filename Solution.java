import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<Object> head) {
    List<String> nodeList = new ArrayList<>();
    do {
      nodeList.add((String) head.val);
      head = head.next;
    }
    while (head != null);
    return nodeList;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    System.out.println(Solution.linkedListValues(a));
    // -> [ "a", "b", "c", "d" ]

    Node<Integer> one = new Node<>(1);
    Node<Integer> two = new Node<>(1);
    Node<Integer> three = new Node<>(1);
    Node<Integer> four = new Node<>(1);
    Node<Integer> five = new Node<>(1);
    one.next = two;
    two.next = three;
    three.next = four;
    four.next = five;

    System.out.println(Solution.linkedListValues(one));
  }
}
