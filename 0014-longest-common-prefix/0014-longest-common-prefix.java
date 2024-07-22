import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans=new StringBuilder();

        /* "ans" will store the common characters in
           first and last String of the Array
           that will eventually give the common prefix
        */

        String first=strs[0];
        String last=strs[strs.length-1];

        int n=Math.min(first.length(),last.length());
        //loop will iterate till length of shorter string
        for(int i=0;i<n;i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
} 