class Solution:
    def getSmallestString(self, s: str) -> str:
        arr = [int(ch) for ch in s]
        n = len(arr)

        for i in range(n):
            for j in range(1, n):
                if arr[j-1] % 2 == arr[j] % 2:
                    if arr[j-1] > arr[j]:
                        arr[j-1] = arr[j] + arr[j-1]
                        arr[j] = arr[j-1] - arr[j]
                        arr[j-1] = arr[j-1] - arr[j]
        
                        return "".join([str(num) for num in arr])
        return "".join([str(num) for num in arr])