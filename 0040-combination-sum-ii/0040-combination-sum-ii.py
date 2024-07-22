class Solution:
    def __init__(self):
        self.result = []  # Resultant list to store combinations

    # Recursive function to find combinations
    def solve(self, nums, target, index, lst):
        # Base case: if target is achieved
        if target == 0:
            self.result.append(lst[:])  # Add current combination to result
            return

        # Base case: if index exceeds array bounds or target is less than current element
        if index == len(nums) or target < nums[index]:
            return

        temp = nums[index]
        lst.append(nums[index])  # Choose current element
        self.solve(nums, target - nums[index], index + 1, lst)  # Recur with reduced target and move to next index
        lst.pop()  # Backtrack: remove last element

        i = 1
        while index + i < len(nums) and nums[index + i] == temp:
            i += 1  # Skip duplicates
        self.solve(nums, target, index + i, lst)  # Recur without choosing current element

    # Main function to find combination sum
    def combinationSum2(self, candidates, target):
        candidates.sort()  # Sort candidates array
        self.solve(candidates, target, 0, [])  # Call recursive function
        return self.result  # Return result