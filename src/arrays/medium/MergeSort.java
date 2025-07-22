package arrays.medium;

public class MergeSort {

    public class Solution{


        public void merge(int[]nums,int l, int mid, int r){
            int[] answerArray = new int[r-l+1];
            int currentPointer = 0;
            int leftPointer = l;
            int rightPointer = mid+1;
            int leftArrayEnd = mid;
            int rightArrayEnd = r;

            while(leftPointer<=leftArrayEnd && rightPointer<=rightArrayEnd){
                if(nums[leftPointer]<nums[rightPointer]){
                    answerArray[currentPointer] = nums[leftPointer];
                    leftPointer++;
                }
                else{
                    answerArray[currentPointer] = nums[rightPointer];
                    rightPointer++;
                }
                currentPointer++;
            }

            while(leftPointer<=leftArrayEnd){
                answerArray[currentPointer] = nums[leftPointer];
                currentPointer++;
                leftPointer++;
            }

            while(rightPointer<=rightArrayEnd){
                answerArray[currentPointer] = nums[rightPointer];
                rightPointer++;
                currentPointer++;
            }
            int actualArrayPointer = l;
            for(int i=0;i<answerArray.length;i++){
                nums[actualArrayPointer] = answerArray[i];
                actualArrayPointer++;
            }

        }

        public void sort(int[]nums , int l, int r){
            if(l>=r){
                return;
            }
            int mid = (l+r)/2;
            sort(nums,l,mid);
            sort(nums, mid + 1,r);
            merge(nums,l,mid,r);
        }

        public int[] sortArray(int[] nums){
            sort(nums,0,nums.length-1);
            return nums;
        }


    }

    public static void main(String[] args) {
        Solution solution = new MergeSort().new Solution();
        int[] nums = {11,89,34,6,23,80};

        solution.sortArray(nums);
        for(int num : nums){
            System.out.println(num+",");
        }
    }

}
