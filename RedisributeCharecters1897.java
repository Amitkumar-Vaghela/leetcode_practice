class Solution {
    public boolean makeEqual(String[] words) {                    
        int[] freq = new int[26];   // make freq array      

        for (int i=0; i< words.length; i++){
            String  w = words[i];   //    let be take out words [abc , abc , cba]  = abc

        for (int j =0; j< w.length(); j++){           
            char ch = w.charAt(j);                    // abc --> a, b, c
             int idx = (int) (ch-'a');             // a , b , c  put  1 2 3 as respectivly  freq array index
            freq[idx] = freq[idx] + 1;              // increase the freq if  char is multiple time 
        }
    }

    for(int i=0; i<26; i++){
        if(freq[i] % words.length != 0){
            return false;
        }
    }
      return true;
    }
}



/*
Input: words = ["abc","aabc","bc"]
Output: true
*/
