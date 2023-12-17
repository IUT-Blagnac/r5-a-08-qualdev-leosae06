Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario Outline: Check if it's Friday
    Given today is <day>
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

  Examples:
    | day      | answer |
    | Sunday   | Nope   |
    | Friday   | TGIF   |
    | Monday   | Nope   |
    | Tuesday  | Nope   |
    | Wednesday| Nope   |
    | Thursday | Nope   |
    | Saturday | Nope   |