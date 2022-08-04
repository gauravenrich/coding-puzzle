package com.puzzle.matrix;

/**
 * @author gsinha
 * Word seach
 * 4th aug 2022
 */
public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        WordSearch wordSearch = new WordSearch();
        System.out.println(wordSearch.exist(board, word));
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        // to keep of characters inside recursive function which we have already included


        for (int i = 0; i < board.length; i++) {
            // to traverse and start searching for word from each index of 2d array
            for (int j = 0; j < board[i].length; j++) {
                if (solve(board, visited, word, 0, i, j)) {
                    // i.e index=0 keeps track of which index of word we are looking for inside recursive function
                    return true;
                }
            }
        }

        return false;
    }

    public boolean solve(char[][] board, boolean[][] visited, String word, int index, int row, int col) {
        if (index == word.length()) { // check if we have already found all the words
            return true;
        }

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return false;
        }

        if (board[row][col] != word.charAt(index) || visited[row][col] == true) { // incase if the character isn't matchingor we have already visited the index return false
            return false;
        }

        visited[row][col] = true;
        // now we traverse all the four directions of the array
        if (solve(board, visited, word, index + 1, row + 1, col)) {
            return true;
        }

        if (solve(board, visited, word, index + 1, row - 1, col)) {
            return true;
        }
        if (solve(board, visited, word, index + 1, row, col + 1)) {
            return true;
        }

        if (solve(board, visited, word, index + 1, row, col - 1)) {
            return true;
        }

        visited[row][col] = false;
        return false;

    }
}
