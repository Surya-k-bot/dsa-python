class Solution:
    def strStr(self, haystack, needle):
        x = len(needle)
        for i in range(len(haystack)):
            if needle == haystack[i:i+x]:
                return i
        return -1