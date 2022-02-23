@place_order_register_before_checkout
Feature:TC15_PlaceOrderRegisterBeforeCheckout

@place_order_register_before_checkout
Scenario: TC15_PlaceOrderRegisterBeforeCheckout
When user launches the browser
And user navigates to home page
And user clicks signup_login button
When user enters name and email
And user clicks signup_button
  Then user verifies that enter account information is visible
And user fills details
And user selects checkbox signup for our newsletter
And user selects checkbox receive special offers
And user fills details2
And user clicks create account button
Then user verifies that account is created
And user verifies logged in as username at top
And user clicks cart button
And verify cart page is displayed
And user clicks proceed to checkout
And verify Address Details and Review Your Order
And user enters description in comment text area

And enters payment details: Name on Card, Card Number, CVC, Expiration date
And user clicks Pay and Confirm Order button
And verifies  success message Your order has been placed successfully
And user clicks delete account button
And user verifies account deleted and clicks Continue button