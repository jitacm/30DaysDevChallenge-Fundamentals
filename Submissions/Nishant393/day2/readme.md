# Task 2 – Missing Number in given list [9, 6, 4, 2, 3, 5, 7, 0, 1]

**Missing Number**: 8

**Explanation**:
    We use the XOR approach:
        1. XOR all numbers from 0 to n
        2. XOR all numbers in the array
        3. XOR the xor_number & xor_arr the two results gives the missing number
        4. and we got the ans is 8 .

