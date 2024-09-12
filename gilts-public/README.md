# README #
Welcome to the Elevate Gilt Portfolio.

# The Problem (and the Mathematics) # 
A _Gilt_ is a British Government issued bond. A _bond_ is a loan - the issuer of the bond promises to pay the holder a certain amount of interest (the coupon) every year, along with the _principal_ (the amount of the loan) after the bond expires.

Say there is a bond with a face value (principal) of £100 with a £1 coupon and a 10 year duration. It will pay £1 in interest every year, until it expires, when it will pay £101 (the principal plus the coupon.)

Your job is to write a _Gilt Portfolio_, a program that manages the buying and selling of Gilts, plus the paying of interest and principal amounts.

The price of a bond on the open market is not just equal to its principal plus the remaining coupon payments - it varies, up and down, according to market conditions.

Let's assume that we own a Gilt with a principal of £100, an interest rate of 1.25% (a coupon of £1.25), and a duration of 20 years. If we hold it to term, we will recieve (100+20*1.25)=£125.

We will, of course, be able to buy this Gilt for _less_ than this amount on the market. Let's say that we pay £55 for this Gilt.

The yield-to-maturity is the relationship between the price of a bond, its interest payments, and its principal value.

The actual formula for this is complicated, so we provide an approximation with a few simplified assumptions:
# Yield to Maturity

**Yield to Maturity = ((Coupon) + (Principal - Price) / Years) / ((Price + Principal) / 2)**

So, if our £100/1.25%/20 year Gilt was bought for £55, it's yield-to-maturity would be:

YTM % = ((1.25) + (100-55)/20) / ((100 + 55) / 2)

YTM % = 3.5 / (155/2) = 4.52% (Approximately)

# Price
The inverse operation is (provided here so you don't have to do some truly awful algebra):

**Price = ((2 * Years * Coupon) - (Years * Principal * Yield percent) + (2 * Principal)) / (Years * Yield percent + 2)**

So, a £1000/4.25%/2 years bond with a 4.46% yield costs:

Price = ((2 * 2 * 42.50) - (2 * 1000 * 0.0446) + (2 * 1000)) / (2 * 0.0446) + 2

Price = 170 - 89.2 + 2000 / 2.0892

Price = 2080.8 / 2.0892

Price = £995.98 (Approx)

# Gilt Pricing
Gilts, and bonds generally, are generally priced by their YTM. E.g. "Ten-year Gilt Yields are at 4.194% right now." Assume that the yield will be the same for all gilts of a given duration, regardless of the coupon and principal.

In our pricing exchange, we'll provide four yields: the two-year yield, the five-year yield, the ten-year yield, and the twenty-year yield.

We will simplify things, and assume that these are the only possible yields for our Gilts.

# Video Links
As extra-curricular research you can watch these videos which discuss some basic but important concepts in the finance sector.

[What to banks do?](https://www.youtube.com/watch?v=6xvHZV3bNew)

[What do brokers do?](https://www.youtube.com/watch?v=Mn6BeJa3PwA)

[What do stock exchanges do?](https://www.youtube.com/watch?v=ORB2IXr7Rvk)

[What are fixed income securities? (part 1)](https://m.youtube.com/watch?v=pxeg5JIfIsM)

[What are fixed income securities? (part 2)](https://www.youtube.com/watch?v=pTz-zSlK3EI)

[What moves exchange rates?](https://www.youtube.com/watch?v=ldeFimQXX8E)


# Other notes
- Round all your results to two decimal places.

- Don't be afraid to use a whiteboard, some paper, or a notes app.

- If you're using assertEquals() for `double` type results, don't forget to use a delta (of 0.01).

- If there's any ambiguity in the instructions, it's up to you how to resolve it.

- Remember that X% means "percent", and thus 5% = 0.05, and 0.75% = 0.0075

# Git Instructions #
You need to clone the `gilts-public` repository, and then work on that. You will not be able to push changes unless you alter the remote to point to your own Elevate repository and push it to a separate branch.


# Part One #
In Part One, you will be implementing tests for the `Gilt` class.
The `Gilt` class has several methods:

- double getCoupon() // Returns the yearly coupon of the Gilt
- double getCouponPercent() // Returns the yearly coupon as a fraction of the principal
- double getPrincipal() // Returns the principal of the gilt
- int getYearsRemaining() // Returns the number of years remaining of the Gilt
- Gilt(double coupon, double principal, int yearsRemaining) // Constructor
- Gilt(double coupon, int yearsRemaining) // Constructor, with a default value of 100 for principal
- double tick() // Advances the year forward 1, returning the amount of money earned from the Gilt.
- boolean expired() // Returns true if the Gilt is expired, and false otherwise.

You should write tests to:

- Ensure that a Gilt can be created, and that its getCoupon, getCouponPercent, getPrincipal, and getYearsRemaining methods work correctly.
- Ensure that a Gilt with more than 0 years remaining is NOT expired
- Ensure that a Gilt with 0 years remaining is expired
- Ensure that "ticking" a non-expiring gilt reduces the number of years remaining on the Gilt and returns the coupon
- Ensure that "ticking" a gilt with 1 year left returns the coupon plus the principal
- Ensure that "ticking" a gilt with 0 years left throws an AlreadyExpiredGiltException

Remember _boundary_, _erroneous_, and _typical_ testing - and don't forget to cover all your bases.

# Part Two #
In Part Two, you will be implementing the `GiltPortfolio` class. Open the `GiltPortfolioTest` class, and look at the tests in it. 

Your job is to implement the `GiltPortfolio` class such that the tests pass. *Do not change the tests.*

A `GiltPortfolio` consists of a list of Gilts and a reference to a GiltPricingEngine.

The GiltPricingEngine returns the price of a Gilt that is to be purchased or sold.

The portfolio also contains a balance, which is the amount of money held in liquid cash.

# Part Three #
In Part Three, you will be implementing the `MallonGiltPricingEngine` class.

You should do this in a *Test Driven Development* way, building tests in the `MallonGiltPricingEngineTest` class, and then building corresponding functionality in the `getPrice()` method.

The `getPrice(Gilt)` method provides a price for a given gilt, and should store a value for the _yield_ for two year, five year, ten year, and twenty year bonds.

To simplify things, you can assume that the gilt's yield is:

- Equal to the two-year yield if it has 1 or 2 years remaining.
- Equal to the five-year yield if it has between 3 and 5 years remaining.
- Equal to the ten-year yield if it has between 6 and 10 years remaining.
- Otherwise, equal to the twenty-year yield.

For your tests, assume a spread of yields of: 2.35%/3.02%/3.56%/4.06%. Confirm that:

- A 2 year, £100 Gilt with a £3.25 coupon costs £101.76
- A 5 year, £1000 Gilt with a £10.25 coupon costs £907.25
- A 10 year, £200 Gilt with a £22 coupon costs £325.32
- A 20 year, £1000 Gilt with a £0 coupon costs £422.48
- A 1 year, £100 Gilt with a £1 coupon costs £98.67
- A 4 year, £1000 Gilt with a £10 coupon costs £923.80
- A 8 year, £100,000 Gilt with a £2250 coupon costs £90826.33
- A 15 year, £50 Gilt with a £0.50 coupon costs £32.41

# Extension 1 # 
If you're done with all of the above, work on adding a command line based interface to manage your portfolio.
The driver file is already created in the ```ui``` package. 
Start the user with £10,000, and have them buy and sell gilts from their portfolio. Randomly generate them some gilts to buy each year, and have a command to "pass time" (tick) to move onto the next year.

# Extension 2 #
So far your gilts will only exist while your application runs - as soon as you close it you will lose your data.
Given the classes in the ```db``` package as examples - integrate a database in your solution to store your gilts.
You will need to:
- Create a table in the ```public``` schema to match your Gilt class layout
- Write a function to retrieve all Gilts
- Write a function to retrieve one Gilt
- Write a function to tick a Gilt and update it's values in the database

Add any other functionality linked to your database that you feel useful.