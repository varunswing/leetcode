class Solution:
    def missingNumber(self, arr: List[int]) -> int:
        n = len(arr) + 1
        a = arr[0]
        b = arr[-1]
        d = (b - a) / (n - 1)

        cur = a
        for i in range(1, n-1):
            exp = cur + d
            if arr[i] != exp: return int(exp)
            cur = exp
        
        return a