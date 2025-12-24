import pytest
from compare_triplets import CompareTriplets

# python -m pytest
@pytest.mark.parametrize(
    "a,b,expected",
    [
        ([1, 2, 3], [3, 2, 1],[1,1]),
        ([5,6,7], [3, 6, 10],[1,1]),
        ([17,28,30], [99,16,8],[2,1])
    ]
)
def test_compare_as_lists(a,b, expected):
    ct = CompareTriplets()
    assert ct.compare_as_lists(a,b) == expected