from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1, (len(nums))):
                if nums[i] + nums[j] == target:
                    return [i, j]
        return []  # Return empty list if no solution found

def main():
    # Test the solution
    solution = Solution()
    nums = [2, 7, 11, 15]
    target = 9
    result = solution.twoSum(nums, target)
    print(result)  # Add this line to see the output

if __name__ == "__main__":
    main()
