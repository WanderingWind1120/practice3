package org.example;

public class MaximalRectangle {
    public int solution (int[][] array){
        if (array.length == 0){
            return 0;
        }
        int ans = 0;
        int [] height = new int[array[0].length];

        for (int i = 0; i <= array.length-1; i++){
            for (int j = 0; j<= array[i].length-1; j++){
                if (array[i][j] == 0){
                    height[j] =0;
                    continue;
                }
                height[j]++;

                for (int cur = j-1, pre = height[j]; cur >=0; cur --){
                    if (height[cur] == 0){
                        break;
                    }
                    pre = Math.min(pre, height[cur]);
                    ans = Math.max(ans, pre * (j - cur +1));
                }
                ans = Math.max(ans, height[j]);
            }
        }
        return ans;
    }
}
