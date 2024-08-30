class Solution:
    def reverseVowels(self, s: str) -> str:
        vows = []
        vowels = "aeiouAEIOU"
        for ch in s:
            if ch in vowels:
                vows.append(ch)
        
        res = ""
        for ch in s:
            if ch in vowels:
                res += vows.pop()
            else:
                res += ch
        
        return res