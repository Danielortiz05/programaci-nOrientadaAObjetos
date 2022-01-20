from car import Car
from account import Account

if __name__ == '__main__':
    print('Hello World!')

    car = Car("AMS154", Account("Juan Octavio", "123.456.789.00"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("LDS8520", Account("James Bond", "524.895.752.01"))
    print(vars(car2))
    print(vars(car2.driver))