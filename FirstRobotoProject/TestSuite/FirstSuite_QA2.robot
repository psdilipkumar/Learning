*** Settings ***
Library    SeleniumLibrary
Suite Setup  initalize(QA2)
Test Teardown    Close Browser
Resource      ../Resources/ckKeywords.robot
*** Test Cases ***
test1
    [Tags]    High
    openCK
    Log To Console    test1

test2
   [Tags]    Med
    openCK
    Log To Console    test2
