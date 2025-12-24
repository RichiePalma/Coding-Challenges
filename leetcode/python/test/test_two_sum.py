import pytest
from two_sum import TwoSum
# python -m pytest
@pytest.mark.parametrize(
    "nums,target,expected",
    [
        ([2,7,11,15],9, [0,1]),
        ([3,2,4],6, [1,2]),
        ([3,3],6, [0,1])
    ]
)
def test_solve_with_two_pointers(nums,target, expected):
    ts = TwoSum()
    assert ts.solve_with_two_pointers(nums,target) == expected
