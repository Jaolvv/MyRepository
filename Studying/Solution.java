package Studying;

class Solution {
    public String longestPalindrome(String s) {
        //s中位置从i到j的字符串若为回文，则p[i][j]为true，否则为false
        boolean[][] p = new boolean[s.length()][s.length()];
        //回文字符串的最大长度
        int max_len = 0;
        //最长回文字符串的起始位置和终止位置的后一位
        int[] max_index = new int[2];

        //初始化一回文和二回文的值
        for(int i = 0; i < s.length(); i++){
            p[i][i] = true;
            if(max_len < 1){
                max_len = 1;
                max_index[0] = i;
                max_index[1] = i+1;
            }
            if(i+1 < s.length()){
                if(s.charAt(i) == s.charAt(i+1)){
                    p[i][i+1] = true;
                    if(max_len < 2){
                        max_len = 2;
                        max_index[0] = i;
                        max_index[1] = i + 2;
                    }
                }
            }
        }

        for(int i = 1; i < s.length() - 1; i++) {
            int j = 1;
            while(i - j >= 0 && i + j < s.length()){
                if(p[i-j+1][i+j-1] == false && p[i-j+1][i+j] == false){
                    break;
                }

                if(p[i-j+1][i+j-1] == true) {
                    if(s.charAt(i-j) == s.charAt(i+j)){
                        p[i - j][i + j] = true;
                        if (max_len < 2*j + 1) {
                            max_len = 2*j + 1;
                            max_index[0] = i - j;
                            max_index[1] = i + j + 1;
                        }
                    }
                }
                if(i + 1 + j < s.length() && p[i-j+1][i+j] == true){
                    if(s.charAt(i-j) == s.charAt(i+1+j)){
                        p[i-j][i+1+j] = true;
                        if(max_len < 2*j + 2){
                            max_len = 2*j + 2;
                            max_index[0] = i - j;
                            max_index[1] = i + 2 + j;
                        }
                    }
                }
                j++;
            }
        }

        if(max_len == 0){
            return "";
        }

        return s.substring(max_index[0], max_index[1]);
    }
}