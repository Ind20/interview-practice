Feature: Api Feature
  @Test1
  Scenario: Get products api
    Given i set uri for "products" endpoint
    When i set the content type
    And i get the api endpoint
    Then i check the status as "200"
    And i check the rate of product with id 1 is "3.9"

  Scenario: Get cart api
    Given i set uri for "carts" endpoint
    When i set the content type
    And i get the api endpoint
    Then i check the status as "200"
    