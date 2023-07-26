Feature: Add to cart Test
  Scenario: User verifyTheSortByProductNameFilter
    Given User is on homepage
  When I Mouse Hover on Women Menu
    And I Mouse Hover on Tops
    And IClick on Jackets
    And I Select Sort By filter “Product Name”
    Then IVerify the products name display in alphabetical order


  Scenario: User verifyT he Sort By Price Filter
    Given I am  on homepage
  When I Mouse Hover on Women Menu
    And I Mouse Hover on Tops
    And I Click on Jackets
    And I Select Sort By filter “Price”
    Then I Verify the products price display in Low to High