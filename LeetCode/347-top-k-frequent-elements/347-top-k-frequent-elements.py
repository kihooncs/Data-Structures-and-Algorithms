class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freqMap = {}
        freqlist = [[] for i in range(len(nums) + 1)]
        result = []
        for val in nums:
            freqMap[val] = freqMap.setdefault(val, 0) + 1
        for key, value in freqMap.items():
            freqlist[value].append(key)
        for i in range(len(freqlist) - 1, 0, -1):
            for val in freqlist[i]:
                result.append(val)
                if len(result) == k:
                    return result
        return result