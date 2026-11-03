class Solution {
    public static boolean explore(char[][] board, int row, int col, int idx, String word) {
        //Base case :
        if (word.length() == idx) {
            return true;
        }
        //Edege Cases
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] == '$' || board[row][col] != word.charAt(idx)) {
            return false; //  $ : Visited char
        }
        int[] dirRow = { -1, 0, 1, 0 };
        int[] dirCol = { 0, -1, 0, 1 };
        // Go all for direction
        // for first mark visite as 'S' char first for SEE word
        char temp = board[row][col];
        board[row][col] = '$';
        for (int d = 0; d < 4; d++) {
            //Faith is i will call function explore that will give to me if other char is present or gies false
            // Recursive level : idx length of string 
            if (explore(board, row + dirRow[d], col + dirCol[d], idx + 1, word)) {
                return true;
            }
        }
        //Unchoose :BackTrack
        board[row][col] = temp;

        return false;
    }

    public boolean exist(char[][] board, String word) {
        char ch = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == ch) {
                    boolean ans = explore(board, i, j, 0, word);
                    if (ans) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}