package com.company.IntersectionofTwoLinkedLists160;

import com.company.LinkedListCycleII142.ListNode;

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aCounter = 0;
        int bCounter = 0;
        if(headA == null || headB == null) return null;

        ListNode nodeA = headA;
        ListNode nodeB = headB;
        do {
            aCounter++;
            nodeA = nodeA.next;
        } while (nodeA != null);
        do {
            bCounter++;
            nodeB = nodeB.next;
        } while (nodeB != null);

        ListNode bigger;
        ListNode smaller;
        int startNodeIndex;
        int biggerLenght;
        if (aCounter >= bCounter) {
            bigger = headA;
            smaller = headB;
            startNodeIndex = aCounter - bCounter;
            biggerLenght = aCounter;
        } else {
            bigger = headB;
            smaller = headA;
            startNodeIndex = bCounter - aCounter;
            biggerLenght = bCounter;
        }

        for (int i = 0; i < biggerLenght; i++) {
            if(i < startNodeIndex) {
                bigger = bigger.next;
                continue;
            }

            if (bigger == smaller) {
                return bigger;
            }

            bigger = bigger.next;
            smaller = smaller.next;
        }

        return null;

    }
}
