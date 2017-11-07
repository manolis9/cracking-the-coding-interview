package com.truelaure.ctci.linkedlists;

import java.util.Objects;

public class LinkedListNode {

    int val;
    LinkedListNode next;

    LinkedListNode(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedListNode that = (LinkedListNode) o;
        return val == that.val &&
                Objects.equals(next, that.next);
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    static LinkedListNode empty() {
        return null;
    }

    static LinkedListNode of(int... list) {
        if (list.length == 0) return null;
        LinkedListNode pre = null;
        LinkedListNode head = null;
        for (int val : list) {
            if (pre == null) {
                head = new LinkedListNode(val);
                pre = head;
            } else {
                pre.next = new LinkedListNode(val);
                pre = pre.next;
            }
        }
        return head;
    }

}