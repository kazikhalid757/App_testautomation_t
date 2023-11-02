Feature: Testing Al jazerra
  @MobileTest
  Scenario: Check Home button
  Given Check home button is availablel
  When Click  home button

  @MobileTest
  Scenario: Check Play  button
    Given Check Play  button is availablel
    When Click  Play  button

  @MobileTest
  Scenario: Check Home button
    Given Check  Menu Bar button is availablel
    When Click   Menu Bar button

  @MobileTest
  Scenario: Verify Search Bar by click
  Given Check Search Bar button is availablel
  When Click  Search Bar button

  @MobileTest
  Scenario: Verify Share  Button by click
  Given Click any post
  Then Check share button is available
  When Click Share button
  Then Check popup window is show

  @MobileTest
  Scenario: Verify a news open
  Given Click any post
  Then Check new page is display

  @MobileTest
  Scenario:Verify a Video option
  Given Check Play button is available
  When Click Play button for video
  And Click video push play button
  Then Check video play push

  @MobileTest
  Scenario: Receive push notifications
  Given Click menu bar
  Then Check enavailable notification button
  When Click enavailable notification button
  Then Check any notification show

  @MobileTest
  Scenario: Check Header font size
  Given check header font size gather than post text

  @MobileTest
  Scenario: Check button  show and click
  Given Click manu bar
  Then Check Setteing button is available
  When Click Setteing button is available
  Then Check Setteing page is available

  @MobileTest
  Scenario: Check Feedback button
  Given Click manu bar
  Then Check Feedbackbutton is available
  When Click Feedbackbutton is available
  Then Check Feedbackpage is available

  @MobileTest
  Scenario:Check Feedback page
  Given Check text box
  When Click text box
  Then Check done button is available
  And Check done button.
    When Click done button

