# Initial author: Romain AURY IUT Blagnac / CPOA / 2020


Feature: Delivering a pizza

  I want to be able to prepare a specific Pizza

  Scenario: Trying to create 2 different cheese pizze
    Given a pizzeriaBrest A
    And a pizzeriaStrasbourg B
    When A creates a cheese pizza
    And B creates a cheese pizza
    Then A and B pizze have not the same name

  Scenario: Trying to create 2 same pizza from different same style pizzerie
    Given a pizzeriaBrest A 
		And a pizzeriaBrest B
    When A creates a grecque pizza
    And B creates a grecque pizza
    Then A and B pizze have the same name