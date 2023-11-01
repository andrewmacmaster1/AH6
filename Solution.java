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
  public static ArrayList<String> linkedListValues(Node<String> head) {
    Node<String> node = head;
    ArrayList<String> nodeList = new ArrayList<>();
    do {
      nodeList.add(node.val);
      node = node.next;
    }
    while (node != null);
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

    Node<String> one = new Node<>("1");
    Node<String> two = new Node<>("2");
    Node<String> three = new Node<>("3");
    Node<String> four = new Node<>("4");
    Node<String> five = new Node<>("5");
    one.next = two;
    two.next = three;
    three.next = four;
    four.next = five;

    System.out.println(Solution.linkedListValues(one));
  }
}
