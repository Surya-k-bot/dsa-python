class Solution(object):
    def findSubstring(self, s, words):
        """
        :type s: str
        :type words: List[str]
        :rtype: List[int]
        """

        res = []
        l1 = len(words[0])
        lw = len(words)
        l = l1 * lw
        words_c = ''.join(sorted(words))
        for i in range(len(s) - l + 1):
            subs = ''.join(sorted([s[i+j*l1:i+j*l1+l1] for j in range(lw)]))
            if subs == words_c:
                res.append(i)

        return res
            

