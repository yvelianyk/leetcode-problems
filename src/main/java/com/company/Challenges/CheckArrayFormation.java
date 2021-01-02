package com.company.Challenges;

import java.util.HashMap;
import java.util.Map;

public class CheckArrayFormation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> pieceIndices = new HashMap<>();
        for (int i = 0; i < pieces.length; i++) {
            int[] piece = pieces[i];
            for (int pieceVal : piece) {
                if (pieceIndices.containsKey(pieceVal)) return false;
                pieceIndices.put(pieceVal, i);
            }
        }
        int index = 0;
        while (index < arr.length) {
            int originalElem = arr[index];
            int pieceIndex = pieceIndices.getOrDefault(originalElem, -1);
            if (pieceIndex == -1) return false;
            int[] piecesArr = pieces[pieceIndex];
            for (int pieceVal : piecesArr) {
                if (pieceVal != arr[index]) return false;
                index++;
            }
        }

        return true;
    }
}
