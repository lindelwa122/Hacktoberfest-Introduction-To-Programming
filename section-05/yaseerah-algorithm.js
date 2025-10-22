Sum of Squares of All Positive Integers Smaller Than n:

# positive integer
n = int(input("Enter a positive integer: "))
if n <= 0:
    print("Please enter a positive number.")
else:
    total = 0

    # Loop through numbers from 1 to n-1
    for i in range(1, n):
        total += i * i  # add the square of i

    print("The sum of squares of all positive integers smaller than", n, "is:", total)
