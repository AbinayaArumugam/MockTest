# MockTest
1. Generating Palindromes without iteration.
Tom thinks there exists only Palindrome numbers. So according to him, his first
number will be 11, then 22 and so on. But Jerry knows the normal number system,
which starts with 1, then 2 and so on. Now Jerry wants to tell some numbers to
Tom.
Your job is to help Jerry and Tom communicate. If Jerry says some number, you
have to translate to Tom's number system.
Note: You are not allowed to iterate all the numbers. Each palindrome number
should be generated.
Example:
Jerry : 2
To Tom : 22
Jerry : 11
To Tom : 111

2. Given a 2D grid of n*m of characters and a word, find all occurrences of a given word in
a grid. A word can be matched in all 8 directions at any point. Word is said to be found in
a direction if all characters match in this direction (not in zig-zag form). The 8 directions
are, horizontally left, horizontally right, vertically up, vertically down and 4 diagonal
directions.
Example 1:
Input: grid = {{a,b,c},{d,r,f},{g,h,i}},
word = "abc"
Output: {{0,0}}
Explanation: From (0,0) one can find "abc" in the horizontally
Given a 2D grid of n*m of characters and a word, find all occurrences of a
given word in a grid. A word can be matched in all 8 directions at any point.
Word is said to be found in a direction if all characters match in this
direction (not in zig-zag form). The 8 directions are, horizontally left,
horizontally right, vertically up, vertically down and 4 diagonal directions.
Example 1:
Input: grid = {{a,b,c},{d,r,f},{g,h,i}},
word = "abc"
Output: {{0,0}}
Explanation: From (0,0) one can find "abc"
in the horizontally right direction.
Example 2:
Input: grid = {{a,b,a,b},{a,b,e,b},{e,b,e,b}}
,word = "abe"
Output: {{0,0},{0,2},{1,0}}
Explanation: From (0,0) one can find "abe" in
right-down diagonal. From (0,2) one can
find "abe" in the left-down diagonal. From
(1,0) one can find "abe" in Horizontally right
direction.

3. Implement the code for Merge Sorting with your own input.

4. Given the root of a binary search tree and the lowest and highest boundaries as low and
high, trim the tree so that all its elements lie in [low, high]. Trimming the tree should not
change the relative structure of the elements that will remain in the tree (i.e., any node's
descendant should remain a descendant). It can be proven that there is a unique answer.
Return the root of the trimmed binary search tree. Note that the root may change
depending on the given bounds.
Example 1:
Input: root = [1,0,2], low = 1, high = 2
Output: [1,null,2]
Example 2:
Input: root = [3,0,4,null,2,null,null,1], low = 1, high = 3
Output: [3,2,null,1]
Example 3:
Input: root = [1], low = 1, high = 2
Output: [1]
Example 4:
Input: root = [1,null,2], low = 1, high = 3
Output: [1,null,2]
Example 5:
Input: root = [1,null,2], low = 2, high = 4
Output: [2]

5. Given an unsorted array A of size N that contains only non-negative integers, find a
contiguous subarray which adds to a given number S.
Example 1:
Input: N = 5, S = 12
A[ ] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements from 2nd position to 4th position is 12
Example 2:
Input: N = 10, S = 15
A[ ] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements from 1st position to 5th position is 15
