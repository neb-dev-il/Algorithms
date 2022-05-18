# Algorithms

## String-Challenge-1

StringChallenge1 class has the function StringChallenge(str) takes the str parameter being passed and returns a compressed version of the string using the Run-length Encoding algorithm. This algorithm works by taking the occurrence of each repeating character and outputting that number along with a single character of the repeating sequence. The string must not contain any numbers, punctuation, or symbols. 

###### Input
> wwwggopp
###### Output
> 3w2g1o2p

###### Input
> aabbcde
###### Output
> 2a2b1c1d1e

###### Input
> wwwbbbw
###### Output
> 3w3b1w


## String-Challenge-2

String-Challenge-2 class has the function StringChallenge(str) takes the str parameter being passed which will be two times (each properly formatted with a colon and am or pm) separated by a hyphen and returns the total number of minutes between the two times. The time will be in a 12-hour clock format.

###### Input
> 9:00am-10:00am
###### Output
> 60

###### Input
> 1:00pm-11:00am
###### Output
> 1320

###### Input
> 12:30pm-12:00am
###### Output
> 690

###### Input
> 1:23am-1:08am
###### Output
> 1425


## Array-Challenge

ArrayChallengeClass class has the function ArrayChallenge(arr) takes the array of numbers stored in arr which will contain integers that represent the amount in dollars that a single stock is worth, and return the maximum profit that could have been made by buying stock on day x and selling stock on day y where y > x. For example: if arr is [44, 30, 24, 32, 35, 30, 40, 38, 15] then your program should return 16 because at index 2 the stock was worth $24 and at index 6 the stock was then worth $40, so if you bought the stock at 24 and sold it at 40, you would have made a profit of $16, which is the maximum profit that could have been made with this list of stock prices. If there is not profit that could have been made with the stock prices, then your program should return -1.

###### Input
> 44, 30, 24, 32, 35, 30, 40, 38, 15
###### Output
> 16

###### Input
> 10, 9, 8, 2
###### Output
> -1

###### Input
> 10, 12, 4, 5, 9
###### Output
> 5

###### Input
> 14, 20, 4, 12, 5, 11
###### Output
> 8