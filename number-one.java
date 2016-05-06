// For a given source string and a target string, you should output the first index(from 0) of target string in source string.
// If target does not exist in source, just return -1.

// ## Clarification
// Do I need to implement KMP Algorithm in a real interview?
// Not necessary. When you meet this problem in a real interview, the interviewer may just want to test your basic implementation ability. But make sure your confirm with the interviewer first.

// ## Example
// If source = "source" and target = "target", return -1.
// If source = "abcdabcdefg" and target = "bcd", return 1.

// ## Challenge
// O(n2) is acceptable. Can you implement an O(n) algorithm? (hint: KMP)

class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //write your code here
        if(source == target){
            if(source == null){
                return -1;
            }else{
                return 0;
            }
        }else{
            if((source == null) || (target == null)){
                return -1;
            }else{
                return source.indexOf(target);
            }
        }
    }
}

// && (logical and)
// || (logical or)
// ! (logical not)

// public int indexOf(int ch): Returns the index within this string of the first occurrence of the specified character or -1 if the character does not occur.
//
// public int indexOf(int ch, int fromIndex): Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index or -1 if the character does not occur.
//
// int indexOf(String str): Returns the index within this string of the first occurrence of the specified substring. If it does not occur as a substring, -1 is returned.
//
// int indexOf(String str, int fromIndex): Returns the index within this string of the first occurrence of the specified substring, starting at the specified index. If it does not occur, -1 is returned.
