package medium;

public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring_v1(String s) {
        int maxLength = 0;
        
        for (int i=0; i<s.length(); i++){
            if (maxLength==0){
                maxLength = 1;
            }
            String subStr = s.substring(i, i+1);
            
            for (int j=i+1; j<s.length(); j++){
                String nextChar = s.substring(j, j+1);
                if (!subStr.contains(nextChar)) {
                    subStr = subStr + nextChar;
                    int len= subStr.length();
                    if ( len> maxLength){
                        maxLength = len;
                    }
                } else {
                    break;
                }
            }
        }
        
        return maxLength;
    }
}