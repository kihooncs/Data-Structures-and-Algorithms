class Solution:
    def isValid(self, s: str) -> bool:
        parenMap = {")": "(", "}": "{", "]": "["}
        stack = []
        for c in s:
            if c in parenMap:
                # c is close paren
                if not stack or parenMap[c] != stack.pop():
                    return False
            else:
                # open paren
                stack.append(c)
        return not stack