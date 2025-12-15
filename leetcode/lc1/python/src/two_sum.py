"""
LeetCode Problem 1: Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
"""
from typing import List


class Solution:
    def two_sum(self, nums: List[int], target: int) -> List[int]:
        """
        Finds two numbers in the array that add up to the target
        :param nums: list of integers
        :param target: target sum
        :return: indices of the two numbers that add up to target
        """
        num_map = {}
        
        for i, num in enumerate(nums):
            complement = target - num
            
            if complement in num_map:
                return [num_map[complement], i]
            
            num_map[num] = i
        
        raise ValueError("No two sum solution")
