def find_missing(nums):
    n = len(nums)
    xor_full = 0
    xor_array = 0

    # XOR all numbers from 0 to n
    for i in range(n + 1):
        xor_full ^= i

    # XOR all elements in the array
    for num in nums:
        xor_array ^= num

    # The missing number is the one not canceled out
    return xor_full ^ xor_array

# Example usage
numbers = [9, 6, 4, 2, 3, 5, 7, 0, 1]  # Missing number is 8
missing = find_missing(numbers)
print("Missing number is:", missing)
