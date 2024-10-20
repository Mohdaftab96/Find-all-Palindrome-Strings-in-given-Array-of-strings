

// Enter the Array String : 5
// Enter the Array String Values : abd abc adaa racecarr cool
//  -1 (No palindromic String Given in the String Array)

// Enter the Array String : 5
// Enter the Array String Values : abc car ada racecar cool
// ada racecar

//=====================without Using ArrayList================


/* 
import java.util.Scanner;
public class Find_all_Palindrome_Strings_in_given_Array_of_strings {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Array String : ");
		int n = sc.nextInt();  // n = 5
		

		String[] str = new String[50];


		System.out.print("Enter the Array String Values : ");
		for(int i=0; i<n; i++){
			str[i] = sc.next(); // str = {"abc", "car", "ada", "racecar", "cool"};
		}

		
		String sum = "";
		int flag = 0;
		for(int i=0; i<n; i++){
				sum = str[i];
				int n1 = sum.length();

				String rev = "";
					for(int j=n1-1; j>=0; j--){
						rev = rev + sum.charAt(j); // cba, rac, ada, racecar, looc
					}


					if(sum.equals(rev)){
						flag = 1;
						System.out.print(sum + " ");
					}
				}

			if(flag == 0){
				System.out.println(" -1 ");
			}
		
	}
}

*/



//=====================Using ArrayList================




//First Palindroming String is : ada


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
