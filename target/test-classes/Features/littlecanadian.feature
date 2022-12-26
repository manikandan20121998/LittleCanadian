Feature: To validate the cloths functionality of little canadian application

@tc1
Scenario: To validate the url and functionality

Given user has to present in website
When check the url and section
Then To verify expected and actual result
@tc2
Scenario: To listout all products with price

Given user has to present in website
When user pass the searchtext "cloths" and enter the button
And Scroll down and get all products with price
Then Vefify anyproduct
@tc3
Scenario: click the product to payment

Given user has to present in website
When action performed in mouse over in shop by brand
And click the brand of silver cross
And select first product and place add to card
And increase the count of five
And move to checkout point
And apply coupon code 
And Click the payment of paypal
And give email or phonenumber to proceed






















