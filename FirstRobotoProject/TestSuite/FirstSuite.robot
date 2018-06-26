*** Settings ***
Library    SeleniumLibrary
Suite Setup  initalize(QA1)
Test Teardown    Close Browser
Resource      ../Resources/ckKeywords.robot
*** Test Cases ***
test1
    [Tags]    High
    :FOR    ${i}    IN RANGE    1    3
    \   openCK
    \   Log To Console    test1
    \   Close Browser

test2
   [Tags]    Med
    openCK
    Log To Console    test2
