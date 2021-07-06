package com.company.Contest192;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

    List<String> history;
    int current;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        current = 0;
    }

    public void visit(String url) {
        history = history.subList(0, current + 1);
        history.add(url);
        current = history.size() - 1;
    }

    public String back(int steps) {
        if(current - steps < 0) {
            current = 0;
            return history.get(0);
        } else {
            current = current - steps;
            return history.get(current);
        }
    }

    public String forward(int steps) {
        if(current + steps >= history.size()) {
            current = history.size() - 1;
            return history.get(history.size() - 1);
        } else {
            current = current + steps;
            return history.get(current);
        }
    }
}
