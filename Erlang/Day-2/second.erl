Fruits = [{tangelo, 2, 0.75}, {lemon, 4, 0.25}].
Totals = [{Fruit, Quantity * Price} || {Fruit, Quantity, Price} <- Fruits].