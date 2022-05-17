# Algorithms

## String-Challenge-1

String Challenge Have the function StringChallenge(str) take the str parameter being passed and return a compressed version of the string using the Run-length encoding algorithm. This algorithm works by taking the occurrence of each repeating character and outputting that number along with a single character of the repeating sequence. For example: "wwwggopp" would return 3w2g1o2p. The string will not contain any numbers, punctuation, or symbols. Examples Input: "aabbcde" Output: 2a2b1c1d1e Input: "wwwbbbw" Output: 3w3b1w

## String-Challenge-2

Have the function StringChallenge(str) take the str parameter being passed which will be two times (each properly formatted with a colon and am or pm) separated by a hyphen and return the total number of minutes between the two times. The time will be in a 12 hour clock format. For example: if str is 9:00am-10:00am then the output should be 60. If str is 1:00pm-11:00am the output should be 1320. Examples Input: "12:30pm-12:00am" Output: 690 Input: "1:23am-1:08am" Output: 1425

## Array-Challenge

Array Challenge Have the function ArrayChallenge(arr) take the array of numbers stored in arr which will contain integers that represent the amount in dollars that a single stock is worth, and return the maximum profit that could have been made by buying stock on day x and selling stock on day y where y > x. For example: if arr is [44, 30, 24, 32, 35, 30, 40, 38, 15] then your program should return 16 because at index 2 the stock was worth $24 and at index 6 the stock was then worth $40, so if you bought the stock at 24 and sold it at 40, you would have made a profit of $16, which is the maximum profit that could have been made with this list of stock prices.

If there is not profit that could have been made with the stock prices, then your program should return -1. For example: arr is [10, 9, 8, 2] then your program should return -1. Examples Input: new int[] {10,12,4,5,9} Output: 5 Input: new int[] {14,20,4,12,5,11} Output: 8