Feature: Login Adactin hotel details

  Scenario Outline: verifying Adactin Login with valid cresentials
    Given user is on Adactin Hotel
    When user should enter the "<username>" and "<password>" and click login
    And select adactin booking room "<Location>", "<hotels>" , "<roomtype>" , "<roomnos>" , "<datepick_in>", "<datepick_out>" , "<adult_room>", "<child_room>"
    When user should click Search
    And Select hotel and click continue
    And User should enter "<firstName>" ,"<lastName>","<address>","<ccNo>","<cvv>"
    And user should select "<cardtype>" , "<expmonth>","<expyrs>"
    When user should click booknow
    Then user should verify success msg

    Examples: 
      | username  | password  | Location  | hotels      | roomtype | roomnos | datepick_in | datepick_out | adult_room | child_room | firstName | lastName | address   | ccNo             | cvv | cardtype | expmonth | expyrs |
      | dhinesh07 | dhinesh07 | Sydney    | Hotel Creek | Double   | 1 - One | 12/09/2021  | 13/09/2021   | 1 - One    | 1 - One    | dhinesh   |       07 | No.12,OMR | 1234567891234567 | 456 | VISA     | May      |   2021 |
      | dhinesh07 | dhinesh07 | Melbourne | Hotel Creek | Double   | 1 - One | 12/09/2021  | 13/09/2021   | 1 - One    | 1 - One    | dhinesh   |       07 | No.12,OMR | 1234567891234567 | 456 | VISA     | May      |   2021 |
      | dhinesh07 | dhinesh07 | Sydney    | Hotel Creek | Double   | 1 - One | 12/09/2021  | 13/09/2021   | 1 - One    | 1 - One    | dhinesh   |       07 | No.12,OMR | 1234567891234567 | 456 | VISA     | May      |   2021 |
      | dhinesh07 | dhinesh07 | Sydney    | Hotel Creek | Double   | 1 - One | 12/09/2021  | 13/09/2021   | 1 - One    | 1 - One    | dhinesh   |       07 | No.12,OMR | 1234567891234567 | 456 | VISA     | May      |   2021 |
      | dhinesh07 | dhinesh07 | Sydney    | Hotel Creek | Double   | 1 - One | 12/09/2021  | 13/09/2021   | 1 - One    | 1 - One    | dhinesh   |       07 | No.12,OMR | 1234567891234567 | 456 | VISA     | May      |   2021 |
      | dhinesh07 | dhinesh07 | Sydney    | Hotel Creek | Double   | 1 - One | 12/09/2021  | 13/09/2021   | 1 - One    | 1 - One    | dhinesh   |       07 | No.12,OMR | 1234567891234567 | 456 | VISA     | May      |   2021 |
      | dhinesh07 | dhinesh07 | Sydney    | Hotel Creek | Double   | 1 - One | 12/09/2021  | 13/09/2021   | 1 - One    | 1 - One    | dhinesh   |       07 | No.12,OMR | 1234567891234567 | 456 | VISA     | May      |   2021 |
      | dhinesh07 | dhinesh07 | Sydney    | Hotel Creek | Double   | 1 - One | 12/09/2021  | 13/09/2021   | 1 - One    | 1 - One    | dhinesh   |       07 | No.12,OMR | 1234567891234567 | 456 | VISA     | May      |   2021 |
      | dhinesh07 | dhinesh07 | Sydney    | Hotel Creek | Double   | 1 - One | 12/09/2021  | 13/09/2021   | 1 - One    | 1 - One    | dhinesh   |       07 | No.12,OMR | 1234567891234567 | 456 | VISA     | May      |   2021 |
      | dhinesh07 | dhinesh07 | Sydney    | Hotel Creek | Double   | 1 - One | 12/09/2021  | 13/09/2021   | 1 - One    | 1 - One    | dhinesh   |       07 | No.12,OMR | 1234567891234567 | 456 | VISA     | May      |   2021 |
