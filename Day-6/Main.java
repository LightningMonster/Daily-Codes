
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median is: " + median);
    }
}
class Solution {
     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int[] merged = new int[totalLength];
        int i = 0, j = 0;

        // Merge arrays
        for (; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }
        for (; j < nums2.length; j++) {
            merged[i + j] = nums2[j];
        }

        // Sort merged array
        java.util.Arrays.sort(merged);

        // Median calculation
        if (totalLength % 2 == 0) {
            return (merged[totalLength / 2 - 1] + merged[totalLength / 2]) / 2.0;
        } else {
            return merged[totalLength / 2];
        }
    }
}
