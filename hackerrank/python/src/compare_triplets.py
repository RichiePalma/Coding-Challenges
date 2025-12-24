#https://www.hackerrank.com/challenges/compare-the-triplets/problem
from typing import List

class CompareTriplets:
    def compare_as_lists(self, a, b):
        print("compar_as_lists",a,b)
        alice_score = 0
        bob_score = 0
        for i in range(len(a)):
            if(a[i] > b[i]):
                alice_score += 1
            elif (a[i] < b[i]):
                bob_score += 1

        return [alice_score,bob_score]



test = CompareTriplets()
res = test.compare_as_lists([1, 2, 3], [3, 2, 1])
print(res)
