### Replace space by "%20" in a string.
#### Write a method to replace all spaces in a string with ‘%20’.

```
The algorithm is as follows:
1. Count the number of spaces during the first scan of the string.
2. Parse the string again from the end and for each character:
    »»If a space is encountered, store “%20”.
    »»Else, store the character as it is in the newly shifted location.
```
