GROUP 6

REFACTORING
1) Removed unused imports for packages with an ambiguous necessity for the future project
Implemented across all use cases by Graeme

2) Added documentation in login and navigation package where function was unclear.
Implemented in the login package by Graeme

3) Deleted unncessary methods in GenerateWaitTimes.java (eugene); now only has the functionality that is actually used 

4) Deleted uncessary classes used for testing - WaitTime and WaitlistTableFormat (eugene)

5) Within the Order Food package: FoodInfo has been renamed to EateryBoilerplate, FoodDecorator to EateryDecorator, and BrowseLocationsUI to BrowseEateriesUI, in order to clarify the meaning of the name of each of these classes and eliminate potential confusion when a class name is separated from the context of its package. A class Food has been added, which creates objects representing the foods on a menu, including the name, price, and description of the food. The Menu class has been refactored to contain a list of Food objects, rather than the previous design of a set amount of food names and prices included within the class as strings. (Ellen)

6) For the TestHarness package: HotelTestHarness.java, MenuTestHarness, PaymentTestHarness, TicketingTestHarness, and WaitTimesTestHarness were added to the package to reduce the bloated class that was testharness.java. In UserList.java, the dead code was removed from the class to make it more efficient. (Jack)

SECOND USE CASE - Payments 

This use case involves users being able to enter payment information that is used for various purposes across the application. Upon navigating to the navigation menu, users are able to select 'payments', where they can enter their payment card information. Different options are presented based on whether the user is using a saved card or entering a new card. 