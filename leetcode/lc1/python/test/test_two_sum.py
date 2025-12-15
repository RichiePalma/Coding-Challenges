import unittest
import sys
import os

# Add the src directory to the path
sys.path.insert(0, os.path.join(os.path.dirname(__file__), '..', 'src'))

from two_sum import Solution


class TestTwoSum(unittest.TestCase):
    
    def setUp(self):
        self.solution = Solution()
    
    def test_example1(self):
        nums = [2, 7, 11, 15]
        target = 9
        expected = [0, 1]
        self.assertEqual(self.solution.two_sum(nums, target), expected)
    
    def test_example2(self):
        nums = [3, 2, 4]
        target = 6
        expected = [1, 2]
        self.assertEqual(self.solution.two_sum(nums, target), expected)
    
    def test_example3(self):
        nums = [3, 3]
        target = 6
        expected = [0, 1]
        self.assertEqual(self.solution.two_sum(nums, target), expected)
    
    def test_no_solution(self):
        nums = [1, 2, 3]
        target = 10
        with self.assertRaises(ValueError):
            self.solution.two_sum(nums, target)


if __name__ == '__main__':
    unittest.main()
