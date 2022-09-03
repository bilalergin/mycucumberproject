Feature: TC22 Verify
  Scenario: TC_22_Test_Cases
    Given user launches the browser for Test TwentyTwo
    Then user navigates to Test TwentyTwo URL
    And user scrolls to bottom of page
    Then user verifies RECOMMENDED ITEMS are visible
    Then user clicks on Add To Cart on Recommended product
    Then user clicks on View Cart button
    Then user verifies that product is displayed in cart page
    Then user closes the Test TwentyTwo browser
  #1. Launch browser
  #2. Navigate to url 'http://automationexercise.com'
  #3. Scroll to bottom of page
  #4. Verify 'RECOMMENDED ITEMS' are visible
  #5. Click on 'Add To Cart' on Recommended product
  #6. Click on 'View Cart' button
  #7. Verify that product is displayed in cart page