# Terkwaz Assessment For Web GUI Test Automation (Selenium) and API Test Automation (RestAssured)

# Environment:
Project is done using a Java/Maven project. 
Selenium WebDriver is using for the Web GUI Test Automation, and RestAssured is used for the API Test Automation.

# Technicality:
The project is implemented in modular design by using the Page Object Model design pattern. 

# Test Automation Programming language and tools:
- Java 17
- Maven
- Selenium
- RESTAssured
- TestNG

# The assignment consists of two required sections:

- Web GUI Test Automation:
-- First Test
--- Navigate to "https://www.google.com/ncr" 
--- Search for "selenium webdriver" 
--- Check that the third result text contains "What is Selenium WebDriver?" 
-- Second Test
--- Navigate to "https://the-internet.herokuapp.com/" 
---- Click on "File Upload" 
---- Upload any small image file 
---- Check that the file has been uploaded successfully 
-- Third Test
--- Navigate to "https://the-internet.herokuapp.com/" 
--- Click on "Dynamic Loading" 
--- Click on "Example 2" 
--- Click "Start" 
--- Wait for loading to finish 
--- Check that the text displayed is "Hello World!" 
- API Test Automation:
-- Navigate to "https://alexwohlbruck.github.io/cat-facts/" 
-- Use the relevant API endpoint to get one random cat fact 
-- Check that the response "text" is not empty
