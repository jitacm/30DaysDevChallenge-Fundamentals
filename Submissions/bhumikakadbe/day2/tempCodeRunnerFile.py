def missingNumber(nums):
    """
    Finds the missing number in the range 0..n given a list of n distinct numbers from that range.
    """
    n = len(nums)
    xor_full = 0
    xor_array = 0
    for i in range(n + 1):
        xor_full ^= i
    for num in nums:
        xor_array ^= num
    return xor_full ^ xor_array

def get_user_input():
    while True:
        try:
            n = int(input("Enter the value of n (the maximum number in the range): "))
            if n < 1:
                print("n must be at least 1. Try again.")
                continue
            break
        except ValueError:
            print("Invalid input. Please enter an integer value for n.")
    print(f"Enter {n} distinct numbers from the range 0 to {n}, missing one number:")
    while True:
        try:
            nums = list(map(int, input("Enter the numbers separated by spaces: ").strip().split()))
            if len(nums) != n:
                print(f"Error: You must enter exactly {n} numbers. Try again.")
                continue
            if any(num < 0 or num > n for num in nums):
                print(f"Error: All numbers must be in the range 0 to {n}. Try again.")
                continue
            if len(set(nums)) != n:
                print("Error: Numbers must be distinct. Try again.")
                continue
            break
        except ValueError:
            print("Invalid input. Please enter integers only.")
    return nums, n

if __name__ == "__main__":
    nums, n = get_user_input()
    print("Missing number is:", missingNumber(nums))