import math

class Solution:
    def pickGifts(self, gifts: List[int], k: int) -> int:
        while k > 0:
            maxNum = 0
            maxIdx = 0
            for i in range(len(gifts)):
                if maxNum < gifts[i]:
                    maxNum = gifts[i]
                    maxIdx = i
            gifts[maxIdx] = math.floor(math.sqrt(maxNum))
            k -= 1
        sum = 0
        for val in gifts:
            sum += val
        return sum