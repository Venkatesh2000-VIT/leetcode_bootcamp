class Solution {
    public boolean isValidSudoku(char[][] board) {
        //int arr[] = {0,0,0,0,0,0,0,0,0};

        for(int i=0;i<board.length;i++){
            int arr[] = {0,0,0,0,0,0,0,0,0};
            for(int j=0;j<9;j++){
                if(!Character.isDigit(board[i][j]))
                    continue;
                if(arr[board[i][j] - '1'] == 1)
                    return false;
                arr[board[i][j] - '1'] = 1;
            }
        }

        for(int i=0;i<board.length;i++){
            int arr[] = {0,0,0,0,0,0,0,0,0};
            for(int j=0;j<9;j++){
                if(!Character.isDigit(board[j][i]))
                    continue;
                if(arr[board[j][i] - '1'] == 1)
                    return false;
                arr[board[j][i] - '1'] = 1;
            }
        }

        for(int x=0;x<=6;x+=3) for(int y=0;y<=6;y+=3) {
            Set<Character> set=new HashSet<>();
            for(int i=x;i<=x+2;i++) for(int j=y;j<=y+2;j++) if(board[i][j]!='.') if(!set.add(board[i][j])) return false;
        }
        return true;
    }
}