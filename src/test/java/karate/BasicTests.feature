Feature: Sample API Test

  Scenario: Get a user by ID
    Given url 'https://jsonplaceholder.typicode.com/users/1'
    When method GET
    Then status 200
    And match response.id == 1


    #Dynamic Data
  Scenario: Get user with dynamic ID
    * def userId = 1
    Given url 'https://jsonplaceholder.typicode.com/users/' + userId
    When method GET
    Then status 200
    And match response.id == userId

    #JSON parsing
  Scenario: Extract data from JSON
    Given url 'https://jsonplaceholder.typicode.com/users/1'
    When method GET
    Then status 200
    * def userName = response.data[0].username
    And match userName == 'Bret'

    #DataDriven
  Scenario Outline: Get user by ID
    Given url 'https://jsonplaceholder.typicode.com/users/<id>'
    When method GET
    Then status 200
    And match response.id == <id>
    Examples:
      | id |
      | 1  |
      | 2  |
      | 3  |

    #Basic Authentication
  Scenario: Test API with Basic Auth
    Given url 'https://api.example.com/secure-endpoint'
    And auth 'username', 'password'
    When method GET
    Then status 200

    #Token based Authentication
  Scenario: OAuth2 token-based authentication
    * def token = 'your-oauth-token'
    Given url 'https://api.example.com/protected-resource'
    And header Authorization = 'Bearer ' + token
    When method GET
    Then status 200

    #Uploadd a file
  Scenario: Upload a file
    Given url 'https://api.example.com/upload'
    And multipart file myFile = { read: 'path/to/file.txt', filename: 'file.txt' }
    When method POST
    Then status 200

    #Request Chaining
  Scenario: Maintain state across requests
    Given url 'https://api.example.com/resource'
    And request { name: 'Sample' }
    When method POST
    Then status 201
    * def resourceId = response.id

    Given url 'https://api.example.com/resource/' + resourceId
    When method GET
    Then status 200
    And match response.name == 'Sample'

  #Pass JSON file as request body
  Scenario: Send JSON file as body
    Given url 'https://api.example.com/users'
    And header Content-Type = 'application/json'
    * def requestBody = read('classpath:src/test/resources/testdata.json')
    When method POST
    And request requestBody
    Then status 201
    And match response.message == 'User created successfully'
