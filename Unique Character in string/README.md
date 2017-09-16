### Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?

```
Without HashMap:
Use array of size 26 representing 26 characters. 
Convert the string to lower case. 
Increase the counter at each character if it is present. 
If the counter exceeds 1, return false. 
But this uses Array data structure.
```
```
Without additional data structure:
We can use a single integer checker = 0. 
Assuming all the characters are lower case they calculated the equivalent position of the character in the alphabet order. 
Int val = s.charAt(i)-‘a’. 
Bit wise calculation is used to check if the character is present or not. (“&” and “<<") 
If checker & (1<<val)  > 0 is true, then, there is a duplicate present. 
Thus, return false. If not, then checker|=(1<<val).
```
