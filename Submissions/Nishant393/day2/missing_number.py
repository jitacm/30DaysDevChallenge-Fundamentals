def find_missing_number(arr):

    n = len(arr)
    
    xor_number = 0
    xor_arr = 0

    for i in range(n + 1):
        xor_number = xor_number^i

    for num in arr:
        xor_arr = xor_arr^num

    return xor_number ^ xor_arr

# Example usage:
nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
print(find_missing_number(nums))  
