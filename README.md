# Automation-selenium
Selenium with Java concepts (TestNG with POM Design Pattern)
Scenario 1:

· Launch a below URL and verify the Title 1. https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/

· Click on Contact and verify the title of the Page. And fill the below information and click on Submit

1. Name

2. Email

3. Comment

· After clicking on the Submit Please verify the “Message Sent” Message

Scenario 2:

· Launch a below URL and verify the Flipkart is present on left side of the top 1. https://www.flipkart.com/

· Enter “iphone 14” in text box and search

· Find the number of items displayed and click on first displayed Search Item

· Verify that navigated to the right page and title of the Page.

Note:

Please implement below concepts as mandatory while designing this Case Study

· Create a Maven Project and update POM.XML accordingly to implement this Case Study.

· Create a branch name – CaseStudy_Basic and implement your code in that branch. After coding is completed commit and push your code into that branch.

· URL should be initialized at a Suite level (Using @BeforeSuite Annotation)

· As using Page Object Model, initialize Page Elements with 60 second timeout (Using PageFactory.initElements with timeouts)

· Create TestNG.xml and run the test cases from TestNG.xml

· Use OOPs concepts to implement this framework and maintain Base Case separately
