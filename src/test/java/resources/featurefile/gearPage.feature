Feature: Shopping cart test

  Scenario:  User should add Product successFully To Shopping Cart()
    Given I am  on homepage
    And I  hover mouse on Gear Menu
    And I click on Bags
    And I click on Product Name ‘Overnight Duffle
    And I verify the text ‘Overnight Duffle’
    And I change Qty 3
    And I click on ‘Add to Cart’ Button.
    And I verify the text‘You added Overnight Duffle to your shopping cart.’
    And I click on ‘shopping cart’ Link into message
    Then I verify the product name ‘Cronus Yoga Pant’