package com.company.BContest37;

import java.util.ArrayList;
import java.util.List;

// TODO: 104 of 105 cases passed on the contest
// Tried solution with TreeSet - need to improve.
// Looks like it's math problem
public class Fancy {
    private final long modulo = 1_000_000_007;
    private final List<Integer> sequence;
    private final List<Operation> operations;
    public Fancy() {
        this.sequence = new ArrayList<>();
        this.operations = new ArrayList<>();
    }

    public void append(int val) {
        this.sequence.add(val);
    }

    public void addAll(int inc) {
        this.operations.add(new Operation(1, inc, this.sequence.size() - 1));
    }

    public void multAll(int m) {
        this.operations.add(new Operation(2, m, this.sequence.size() - 1));
    }

    public int getIndex(int idx) {
        if (idx >= this.sequence.size()) return -1;
        long val = this.sequence.get(idx);

        for (Operation operation : operations) {
            if (idx > operation.endIndex) continue;
            if (operation.operation == 1) {
                val = (val + operation.value) % modulo;
                continue;
            }
            if (operation.operation == 2) {
                val = (val * operation.value) % modulo;
            }
        }
        return (int) val;
    }

    class Operation {
        int operation;// 1 - add all, 2 -mult all
        int value;
        int endIndex;
        public Operation(int operation, int value, int endIndex) {
            this.operation = operation;
            this.value = value;
            this.endIndex = endIndex;
        }
    }
}
