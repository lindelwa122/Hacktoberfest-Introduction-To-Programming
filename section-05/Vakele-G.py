def main():
    amount_due = input("Enter amount due: ")
    amount_paid = input("Enter amount paid: ")
    print(change(amount_due,amout_paid))

def change(due: float, paid: float):

    denominations = [
        200,
        100,
        50,
        20,
        10,
        5,
        2,
      ``1,
        0.50,
        0.20,
        0.10
    ]
    
    change_owed = paid - due
    change_in_denominations = {}
    for value in denominations:
        if change_owed - value >= 0:
            count = 0
            while change_owed - value >= 0:
                count += 1
                change_in_denominations[value] = count
                change_owed -= value

    return change_in_denominations

if __name__ == "__main__":
    main()
