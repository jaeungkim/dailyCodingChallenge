class Solution {
    public void setZeroes(int[][] matrix) {
        List rowList = new ArrayList<Integer>();
        List columnList = new ArrayList<Integer>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                int curr = matrix[i][j];
                if(curr == 0){
                    if(!rowList.contains(i))
                        rowList.add(i);
                    if(!columnList.contains(j))
                        columnList.add(j);
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                int curr = matrix[i][j];
                if(rowList.contains(i))
                    matrix[i][j] = 0;
                else if(columnList.contains(j))
                    matrix[i][j] = 0;
            }
        }
    }
}
