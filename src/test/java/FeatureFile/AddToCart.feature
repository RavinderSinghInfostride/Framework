Feature: to test add to cart functionality

  Scenario Outline: check user is able to add product to cart
    Given user is in login page
    When user enters "<username>" and "<password>" and clicks on login button
    And click add to cart button of a product
    Then product is added product
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |