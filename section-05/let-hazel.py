def sum_of_positive_squares(n):
  if n <= 0:
    raise ValueError
  for i in range(n):
    if i > 0:
      f = i * (i + 1) * (2 * i + 1)//6
  return f

sum_of_positive_squares(3)
