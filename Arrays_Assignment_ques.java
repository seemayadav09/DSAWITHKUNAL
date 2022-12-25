ques 1
https://leetcode.com/problems/build-array-from-permutation/ 


class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
             ans[i]=nums[nums[i]];

        }
        return ans;
        
    }
}




ques 2
https://leetcode.com/problems/concatenation-of-array/ 

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<2*nums.length;i++){
            if(i<nums.length){
                ans[i]=nums[i];
            }else{
                ans[i]=nums[i-nums.length];
            }
        }
        return ans;
    }
    


        

ques 3
https://leetcode.com/problems/running-sum-of-1d-array/ 

class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        ans[0]=nums[0];
        
        for(int i=1;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                sum=sum+nums[j];
                ans[i]=nums[i]+sum;
            }
        }
        return ans;
        
    }
}

ques 4
https://leetcode.com/problems/richest-customer-wealth/ 

class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealth=new int[accounts.length];
        
        int maxwealth=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            wealth[i]=sum;
            if(wealth[i]>maxwealth){
                maxwealth=wealth[i];

            }
            
        }
    }
}

ques 5
https://leetcode.com/problems/shuffle-the-array/ 

class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        // Rotate the element to the left
        for (int i = 0, q = 1, k = n; i < n; i++, k++, q++){
            for (int j = k; j > i + q; j--) {
                // swap a[j-1], a[j]
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
        
            
    

    }
        
    
}
ques 6   //good one
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/ 
import java.util.ArrayList;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Initialize maximum element 
        
         int max = candies[0]; 
         // Traverse array elem to find the highest number  
         for (int i = 1; i < candies.length; i++) 
             if (candies[i] > max) 
                 max = candies[i]; 
        //Initialize output list
        List<Boolean> output = new ArrayList<>(); 
        //Loop through each elem to set output[i] to true or false, depending on the sum of candies[i] and extraCandies
        for(int i =0; i<candies.length; i++){
            if(candies[i]+extraCandies<max){
                output.add(false);  //adding true and false in list
            }else{
                output.add(true);
            }
        }
        //finally, return the output list
        return output;
        
   






        
        ArrayList<Boolean>list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max(candies)){
                list.add(true);
            }else{
                list.add(false);
            }

            
        }
        return list;
        
    }

    public int max(int[] candies){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        
        }
        return max;
    
    }
}
ques7
https://leetcode.com/problems/number-of-good-pairs/ 
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    count++;
                }

            }
        }
        return count;
    }
}

ques8
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/ 
import java.util.Arrays;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] list=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int count=0;
            
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;


                }


            }
            list[i]=count;
        }
        return (list);

    }
}
ques9
https://leetcode.com/problems/create-target-array-in-the-given-order/ 
List<Integer> list = new ArrayList<>();
for (int i = 0; i < nums.length; i++) {
      list.add(index[i], nums[i]);
    }
    int[] ans = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      ans[i] = list.get(i);
    }
    return ans;
    
    
ques 10 good one
    
 class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean result=true;
        char[] alphabets={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<26;i++){
            if(sentence.contains(Character.toString(alphabets[i]))){
                    continue;
            }
            else{
                
                result=false;
                break;

            }
        }
        return result;
            
        

        
    }
}
   
}    
    
    
