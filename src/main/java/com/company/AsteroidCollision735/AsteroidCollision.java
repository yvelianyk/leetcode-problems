package com.company.AsteroidCollision735;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        if (asteroids.length == 0) return new int[]{};
        Stack<Integer> stack = new Stack<>();
        for (int ast : asteroids) {
            stack.push(ast);
            boolean flag = true;
            while (!stack.isEmpty() && stack.size() > 1 && flag) {
                int asteroid = stack.pop();
                int last = stack.peek();

                int asteroidAbs = Math.abs(asteroid);
                int lastAbs = Math.abs(last);
                if (asteroid < 0 && last > 0) {
                    stack.pop();
                    if (asteroidAbs > lastAbs) stack.push(asteroid);
                    if (lastAbs > asteroidAbs) stack.push(last);
                    continue;
                }
                flag = false;
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        int index = 0;
        for (Integer integer : stack) result[index++] = integer;
        return result;
    }

}
