Feature: Add to laptop Products to the cart

  Scenario: Add two Laptops from the Product Store
    Given I'm on the Product Store Page
    When I select the category as Laptops
    And I Select Sony Vaio laptop
    And I Select Dell laptop
    Then the laptops should be added to the cart
    And I click on the place Order
    And my billing details are
      | Name | Country | City   | Card                | Month | Year |
      | demo | Spain   | Madrid | 5555 5555 5555 4444 | 04    | 2026 |
    When I fill the Billing details and click purchase
    Then the purchase id and amount should appear

