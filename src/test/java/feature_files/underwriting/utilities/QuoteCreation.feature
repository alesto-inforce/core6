# As an internal user i would like to be able to create quotes

Feature: Quote Creation

  #------------------------------ Scenario : Quote Creation ------------------------------#

  @Underwriting
    @QuoteCreation

  Scenario Outline: Quote Creation - row "<row>"

    Given I am logged in to Pure as "<subrole>"
    When I navigate to Quotes
    And I initiate a new quote with details in file "<file>" in sheet "<sheet>" row "<row>"
    And I create a quote with details in sheet "<sheet>" row "<row>"
    #And I accept underwriting referrals
    #And I rate the quote
    Examples:
      | subrole | file          | sheet        | row |

#      | A0      | QuoteCreation | QuoteCreator | 1   |
#      | A0      | QuoteCreation | QuoteCreator | 6   |
#      | A0      | QuoteCreation | QuoteCreator | 11   |
#      | A0      | QuoteCreation | QuoteCreator | 16   |
#      | A0      | QuoteCreation | QuoteCreator | 21   |
#      | A0      | QuoteCreation | QuoteCreator | 26   |
#      | A0      | QuoteCreation | QuoteCreator | 31   |
#      | A0      | QuoteCreation | QuoteCreator | 36   |
#      | A0      | QuoteCreation | QuoteCreator | 41   |
#      | A0      | QuoteCreation | QuoteCreator | 46   |
#     | A0      | QuoteCreation | QuoteCreator | 51   |
#     | A0      | QuoteCreation | QuoteCreator | 56   |
#     | A0      | QuoteCreation | QuoteCreator | 61   |
#     | A0      | QuoteCreation | QuoteCreator | 66   |
#     | A0      | QuoteCreation | QuoteCreator | 71   |
#     | A0      | QuoteCreation | QuoteCreator | 76   |
#     | A0      | QuoteCreation | QuoteCreator | 81   |
#     | A0      | QuoteCreation | QuoteCreator | 86   |
#     | A0      | QuoteCreation | QuoteCreator | 91   |
#     | A0      | QuoteCreation | QuoteCreator | 96   |
#     | A0      | QuoteCreation | QuoteCreator | 101   |
#     | A0      | QuoteCreation | QuoteCreator | 106   |
#     | A0      | QuoteCreation | QuoteCreator | 111   |
#     | A0      | QuoteCreation | QuoteCreator | 116   |
#     | A0      | QuoteCreation | QuoteCreator | 121   |
#     | A0      | QuoteCreation | QuoteCreator | 126   |
#     | A0      | QuoteCreation | QuoteCreator | 131   |
#     | A0      | QuoteCreation | QuoteCreator | 136   |
#     | A0      | QuoteCreation | QuoteCreator | 141   |
#     | A0      | QuoteCreation | QuoteCreator | 146   |
#     | A0      | QuoteCreation | QuoteCreator | 151   |
     | A0      | QuoteCreation | QuoteCreator | 156   |
#     | A0      | QuoteCreation | QuoteCreator | 161   |
#     | A0      | QuoteCreation | QuoteCreator | 166   |
#     | A0      | QuoteCreation | QuoteCreator | 171   |
#     | A0      | QuoteCreation | QuoteCreator | 176   |
#     | A0      | QuoteCreation | QuoteCreator | 181   |
#     | A0      | QuoteCreation | QuoteCreator | 186   |
#     | A0      | QuoteCreation | QuoteCreator | 191   |
#     | A0      | QuoteCreation | QuoteCreator | 196   |
#     | A0      | QuoteCreation | QuoteCreator | 201   |
#     | A0      | QuoteCreation | QuoteCreator | 206   |
     #| A0      | QuoteCreation | QuoteCreator | 211   |
     #| A0      | QuoteCreation | QuoteCreator | 216   |
     #| A0      | QuoteCreation | QuoteCreator | 221   |
     #| A0      | QuoteCreation | QuoteCreator | 226   |
     #| A0      | QuoteCreation | QuoteCreator | 231   |
     #| A0      | QuoteCreation | QuoteCreator | 236   |
     #| A0      | QuoteCreation | QuoteCreator | 241   |
     #| A0      | QuoteCreation | QuoteCreator | 246   |
