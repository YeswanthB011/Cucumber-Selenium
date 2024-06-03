Feature: Register User

  @S01
  Scenario: New Login/Signup
    Given new browser opened
    When Navigate to url 'http://automationexercise.com'
    Then Verify that home page is visible successfully
    When Click the 'Signup / Login' button

  @S02
  Scenario: signup
    When Verify 'New User Signup!' is visible
    Then Enter name 'Tobirama' and email address 'tobirama@konaha.com'
    Then submit Signup button

  @S03
  Scenario Outline: New user registration
    When Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And Fill details: Title, Name, Email, Password
      | Title | Name     | Email               | Password   |
      | Mr.   | Tobirama | tobirama@konaha.com | HateUchiha |
    And Select DOB
    Then Select checkbox 'Sign up for our newsletter!'
    And Select checkbox 'Receive special offers from our partners!'
    Then Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
      | First name | Last name | Company | Address            | Address2  | Country     | State       | City   | Zipcode | Mobile Number |
      | Tobirama   | Senju     | Hokage  | konaha,leafvillage | near fort | narutoverse | leafvillage | konaha |    0001 |    9876543210 |
    When Click 'Create Account button'

  @S04
  Scenario: Check created Acc
    Given redirected to acc created page
    When Verify that 'ACCOUNT CREATED!' is visible or not
    Then Click 'Continue' button

  @S04
  Scenario: Delete Account
    When Verify that 'Logged in as username' is  visible or not 
    Then Click 'Delete Account' button if visible
    And Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
