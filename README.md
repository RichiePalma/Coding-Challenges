# coding-challenges
Code submissions for LeetCode, HackerRank and other similar platforms.

## Directory Structure

This repository follows a standardized directory structure for organizing coding challenge solutions:

```
{platform}/{question-no}/{language}/{src||test}/filename
```

### Structure Breakdown

- **platform**: The coding challenge platform (e.g., `leetcode`, `hackerrank`, `codewars`)
- **question-no**: Platform-specific question identifier (e.g., `lc1` for LeetCode Problem 1, `hr1` for HackerRank Problem 1)
- **language**: Programming language used (e.g., `java`, `python`, `javascript`, `cpp`, `go`)
- **src||test**: Either `src` for source code or `test` for test files
- **filename**: The actual source or test file

### Examples

#### LeetCode Problem 1 (Two Sum) in Java
```
leetcode/lc1/java/src/TwoSum.java
leetcode/lc1/java/test/TwoSumTest.java
```

#### LeetCode Problem 1 (Two Sum) in Python
```
leetcode/lc1/python/src/two_sum.py
leetcode/lc1/python/test/test_two_sum.py
```

#### HackerRank Problem in Java
```
hackerrank/hr1/java/src/SimpleArraySum.java
hackerrank/hr1/java/test/SimpleArraySumTest.java
```

## Supported Languages

The repository supports submissions in any programming language that works with IntelliJ IDEA, Eclipse, Visual Studio Code, or other appropriate IDEs, including but not limited to:

- Java
- Python
- JavaScript/TypeScript
- C++
- Go
- C#
- Rust
- And more...

## Testing

Each solution should include comprehensive test cases in the `test` directory to validate the implementation.
