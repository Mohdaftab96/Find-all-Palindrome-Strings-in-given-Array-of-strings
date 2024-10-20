

// Input: arr[] = {"abc", "car", "ada", "racecar", "cool"}
// Output: ada racecar
// Explanation: These two are the only palindrome strings in the given array

// Input: arr[] = {"def", "ab"}
// Output: -1
// Explanation: No palindrome string is present in the given array


import java.util.ArrayList;
import java.util.Arrays;

public class Find_all_Palindrome_Strings_in_given_Array_of_strings {

    public static boolean isPalindrom(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static ArrayList<String> palindromicString(String[] arr, int n){

        ArrayList<String> ans = new ArrayList<String>();
        for(int i = 0; i<n; i++){
            if(isPalindrom(arr[i])){
                ans.add(arr[i]);
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        String[] arr = {"abc", "car", "ada", "racecar", "cool"};
        int n = arr.length;

        ArrayList<String> s = palindromicString(arr, n);

        if(s.size() == 0){
            System.out.print("-1");
        }

        for(String st : s){
            System.out.print(st + " ");
        }


    }
}
