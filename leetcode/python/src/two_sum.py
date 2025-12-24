#https://leetcode.com/problems/two-sum/
from typing import List

class TwoSum:
    def solve_with_two_pointers(self, nums: List[int], target: int) -> List[int]:
        i = 0
        j = len(nums) - 1
        nums = sorted(list(enumerate(nums)),key=lambda x:x[1])

        while i < j:
            if nums[i][1] + nums[j][1] < target:
                i += 1
            elif nums[i][1] + nums[j][1] > target:
                j -= 1
            else:
                break

        return [nums[i][0],nums[j][0]]