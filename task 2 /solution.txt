💡 Explanation:

- We initialize missing_num with the size of the vector nums, which represents the number n in the range [0, n].
- We iterate through the vector nums using a for loop, XORing missing_num with the index i and the value nums[i].
- After the loop, missing_num will hold the missing number, which is the result of XORing the two sums together. All numbers present in both sets cancel each other out, leaving only the single number that was missing.

🔑 This solution has a linear runtime complexity of O(n) and constant extra space complexity of O(1), meeting the requirements. When you run this code with the provided vector nums, it will output the missing number, which is 8.
