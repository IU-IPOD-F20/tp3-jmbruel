# Initial author: Romain AURY IUT Blagnac / CPOA / 2020

Feature: Build a pizzeria

  I want to be able to build some pizzerias

  Scenario: Trying to create a simple pizzeria
    Given a random String A
    And A is not Strasbourg or Brest
    When trying to create a pizzeria of type A
    Then the pizzeria is not created

  Scenario: Trying to create a pizzeria in Brest
    Given a string Brest A
    When trying to create a pizzeria of type A
    Then the pizzeria is created

  Scenario: Trying to create a pizzeria in Strasbourg
    Given a string Strasbourg A
    When trying to create a pizzeria of type A
    Then the pizzeria is created