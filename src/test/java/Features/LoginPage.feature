Feature: Login Againt L1 

 Scenario: Successfuly Log in With L1 Agint Credentials

   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   Then Page Title should be "Recently Viewed | Contacts | Salesforce"
   When User Click on logout link
   Then Page Title should be "Recently Viewed | Contacts | Salesforce"
   And Close brower
