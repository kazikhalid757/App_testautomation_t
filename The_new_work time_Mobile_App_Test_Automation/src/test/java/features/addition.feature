Feature: Testing The New Work Times
  @MobileTest
  Scenario: Check Toady button
  Given Check Toady button is availablel
  When Click  home button

  @MobileTest
  Scenario: Check Play  button
    Given Check Play  button is availablel
    When Click  Play  button

  @MobileTest
  Scenario: Check  For you  button
    Given Check  For you button is availablel
    When Click   For you button

  @MobileTest
  Scenario: Check  sections  button
    Given Check  sections button is availablel
    When Click   sections button

  @MobileTest
  Scenario: Verify Search Bar by click
  Given Check Search Bar button is availablel
  When Click  Search Bar button


  @MobileTest
  Scenario: Verify Profile Button
  Given Click Profile
  Then Check new page is display

