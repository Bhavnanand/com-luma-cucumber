Feature: Shopping cart test
  Scenario:  user should Add Product SuccessFully to Shopping Cart()
  Given  I am  on homepage
  And I  hover mouse on Gear Menur on Men Menu
  And I  hover mouse on  Bottoms
  And I Click on Pants
  And I hover mouse on product name‘Cronus Yoga Pant’ and click on size32.
  And I  Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.And I Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
  And IMouse Hover on product name‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
  And I Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
  Then I Click on ‘shopping cart’ Link into message
  And I Verify the text ‘Shopping Cart.’
  And I Verify the product name ‘Cronus Yoga Pant’
  And IVerify the product size ‘32’
  And I Verify the product colour ‘Black’

