package com.company.wordsearchII212;

import java.util.ArrayList;
import java.util.List;

// Can be solved by using Trie data structure
// First create the Trie dictionary of words
// after that iterate over board and check if some
// letter is starting of some word if yes add new char to that
// part of word and continue search till find complete word
// in the dictionary.
// It decreasing complexity because we should not check every character
// in every word(Something like that)
public class WordSearchII {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (checkWord(board, word)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean checkWord(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            char[] chars = board[i];
            for (int j = 0; j < chars.length; j++) {
                if (exist(board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, int row, int col, int index, String word) {
        if (board[row][col] == '*' || board[row][col] != word.charAt(index)) {
            return false;
        }

        if (index == word.length() - 1) {
            return true;
        }

        char character = board[row][col];
        board[row][col] = '*';
        if (
                row - 1 >= 0 &&
                exist(board, row - 1, col, index + 1, word)
        ) {
            board[row][col] = character;
            return true;
        }
        if (
                row + 1 < board.length &&
                exist(board, row + 1, col, index + 1, word)
        ) {
            board[row][col] = character;
            return true;
        }
        if (
                col - 1 >= 0 &&
                exist(board, row, col - 1, index + 1, word)
        ) {
            board[row][col] = character;
            return true;
        }
        if (
                col + 1 < board[0].length &&
                exist(board, row, col + 1, index + 1, word)
        ) {
            board[row][col] = character;
            return true;
        }

        board[row][col] = character;
        return false;
    }
}
