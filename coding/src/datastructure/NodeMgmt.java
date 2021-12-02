package datastructure;

public class NodeMgmt {
    Node head = null;

    public class Node {
        Node left;
        Node right;
        int value;
        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        // CASE1: Node 가 하나도 없을 때
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            // CASE2: Node 가 하나 이상 들어가 있을 때
            Node findNode = this.head;
            while (true) {
                // CASE2-1: 현재 Node 의 왼쪽에 Node가 들어가야 할 때



                // CASE2-2: 현재 Node 의 오른쪽에 Node가 들어가야 할 때
            }

        }
    }
}
