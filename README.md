# Vending Machine Project

## Overview

This project is a simulation of a candy vending machine implemented in Java. The vending machine is designed to handle a variety of products, including candies, chips, and drinks. Users can interact with the vending machine by adding currency, selecting products, and receiving change.

### Key Features

1. **Product Management**:
    - The vending machine supports multiple types of products, each with unique attributes. These products are categorized into candies, chips, and drinks.
    - Each product has attributes such as ID, price, name, quantity, and a specific characteristic (e.g., flavor for chips, size for drinks).

2. **Currency Handling**:
    - Users can add currency to the vending machine in predetermined amounts (1, 2, 5, 10, 20, 50, 100, 200, 500, 1000).
    - The machine maintains a deposit pool to track the amount of money deposited by the user.

3. **Product Selection**:
    - Users can request a product by its ID if they have sufficient funds and the product is in stock.
    - The machine dispenses the product, reduces the quantity of the product, and adjusts the user's balance accordingly.

4. **Session Management**:
    - Users can end their session at any time to receive their remaining balance as change.
    - The machine resets the deposit pool after returning the change.

5. **Product Information**:
    - Users can retrieve descriptions of available products, including details like price and remaining quantity.
    - The machine can list all available products with their details.

### Class Structure

- **Abstract Class**: `Product`
    - Defines the basic properties and methods for all products.
    - Includes abstract methods `examine()` and `use()` to be implemented by specific product types.

- **Concrete Classes**: `Candy`, `Chips`, `Drinks`
    - Extend the `Product` class and provide specific implementations for the `examine()` and `use()` methods.
    - Each class includes additional attributes relevant to the product type.

- **Interface**: `VendingMachine`
    - Defines the methods required for vending machine operations such as adding currency, requesting products, ending sessions, getting product descriptions, and checking balances.

- **Implementation Class**: `CandyVendingMachine`
    - Implements the `VendingMachine`  interface.
    - Manages product inventory and user interactions.

### Example 
The main class demonstrates how to use the `CandyVendingMachine` class. It shows how to add
currency, request a product, check the balance, and end the session

