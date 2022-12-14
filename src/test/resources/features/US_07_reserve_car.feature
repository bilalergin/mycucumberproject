@reserve_car
Feature: reserve_car
  Scenario Outline: reserve_car_as_customer
    Given user is on the login page
#      lets first log in, then follow the steps
    And user login dropdown
    And user sends username "<username>"
    And user sends password "<password>"
    When user clicks on login button
    And user selects a "<car>"
    And user enters pick up place "<pick_place>"
    And user enters drop off place "<drop_place>"
    And user enters pick up date "<pick_date>"
    And user enters pick up time "<pick_time>"
    And user enters drop off date "<drop_date>"
    And user enters drop off time "<drop_time>"
    Then user clicks on continue reservation
    Then verify complete reservation screen pop up
    And user enters card number "<card_number>"
    And user enters "<name>" on the card
    And user enters "<expire_date>" and "<CVC>"
    And user checks the agreement
    And user clicks complete reservation
    Then verify Reservation created successfully pop up
   Then close the application
    Examples:
      |username|password|car|pick_place|drop_place|pick_date|pick_time|drop_date|drop_time|card_number|name|expire_date|CVC|
      |customer@bluerentalcars.com|12345|VW Polo|Liverpool|Lincoln|10/09/2027|03:00PM|09/09/2028|07:00AM|2468357946896274|Bilal Can|1029|645|
#