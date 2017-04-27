Feature: User should able to refine all the products so he can use refine functionality

  @brand
  Scenario Outline: User should able to refine products by brands

    Given User is on Amazon home page
    When User navigates to Camera & Photo
    And User uses refine by "<Featured Brands>" from left hand menu
    Then User should able to see products refine by "<Featured Brands>"
    Examples:
      | Featured Brands |
      |ScanDisk         |
      |Anker            |
      |Kingston         |





