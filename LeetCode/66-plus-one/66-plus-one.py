class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        increment = 0
        i = len(digits) - 1
        while i >= 0:
            digits[i] += 1
            if digits[i] > 9:
                # need overflow
                digits[i] -= 10
                i -= 1
            else:
                return digits
        digits.insert(0, 1)
        return digits
         