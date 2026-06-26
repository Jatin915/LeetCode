// LeetCode 142: Linked List Cycle II
// Difficulty: Medium
// Link: https://leetcode.com/problems/linked-list-cycle-ii/

class LC36 {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {

                char ch = board[i][j];

                if(ch == '.') continue;

                if(!set.add(ch + "row" + i) ||
                   !set.add(ch + "col" + j) ||
                   !set.add(ch + "box" + (i/3) + "-" + (j/3))) {
                    return false;
                }
            }
        }

        return true;
    }
}