package com.company.AugustLeetcodeChallenge;

import java.util.HashMap;
import java.util.Map;

public class RobotCycle {

    public boolean isRobotBounded(String instructions) {
        Map<String, Character> FSM = new HashMap<>();
        Map<Character, int[]> dirs = new HashMap<>();

        dirs.put('N', new int[]{0, 1});
        dirs.put('S', new int[]{0, -1});
        dirs.put('W', new int[]{-1, 0});
        dirs.put('E', new int[]{1, 0});

        FSM.put("NG", 'N');
        FSM.put("SG", 'S');
        FSM.put("EG", 'E');
        FSM.put("WG", 'W');

        FSM.put("NL", 'W');
        FSM.put("SL", 'E');
        FSM.put("EL", 'N');
        FSM.put("WL", 'S');

        FSM.put("NR", 'E');
        FSM.put("SR", 'W');
        FSM.put("ER", 'S');
        FSM.put("WR", 'N');

        char[] chars = instructions.toCharArray();
        char currDir = 'N';
        int[] currPos = new int[]{0, 0};
        for (char aChar : chars) {
            currDir = FSM.get(String.valueOf(currDir) + aChar);
            if (aChar == 'G') {
                currPos[0] += dirs.get(currDir)[0];
                currPos[1] += dirs.get(currDir)[1];
            }
        }
        return currPos[0] == 0 && currPos[1] == 0 || currDir != 'N';
    }
}
