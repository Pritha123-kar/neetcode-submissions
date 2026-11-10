/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        HashMap<Node, Node> map = new HashMap<>();

        Node temp = head;

        // Step 1: Create a copy of every node
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        // Step 2: Assign next and random pointers
        temp = head;

        while (temp != null) {

            Node copy = map.get(temp);

            copy.next = map.get(temp.next);
            copy.random = map.get(temp.random);

            temp = temp.next;
        }

        // Step 3: Return the copied head
        return map.get(head);
    }
}