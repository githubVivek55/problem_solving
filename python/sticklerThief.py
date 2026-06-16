
def getMaxSum(input):
    if len(input)==0:
        return 0
    if len(input) ==1:
        return input[1]
    n = len(input)
    dp = [0]*n

    dp[0] = input[0]
    dp[1] = max(input[0],input[1])
    for i in range(2,n):
        dp[i] = max(dp[i-1], input[i]+dp[i-2])

    return dp[n-1]

if __name__ == "__main__":
    arr = [2, 1, 4, 9]
    print(arr)
    result = getMaxSum(arr)
    print(f'Result: {result}')


