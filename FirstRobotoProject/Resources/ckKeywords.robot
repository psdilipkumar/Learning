*** Settings ***
Library    SeleniumLibrary
Resource    ckXPaths.robot
*** Variable ***
${Browser}    chrome
${QA1_URL}       https://qa1.learn.cisco/
${QA1_Login_Id}   user10010@mailinator.com
${QA1_Login_Pwd}  Cisco@1234
${QA2_URL}       https://qa2.learn.cisco/
${QA2_Login_Id}   ck-admin@external.cisco.com
${QA2_Login_Pwd}  Cisco@123
${T9URL}    https://t9-qa.xkit.co/
${Env}
*** Keywords ***
initalize(${lEnv})
    Log To Console    Initalized
    Set Suite Variable    ${Env}        ${lEnv}
    Set Selenium Implicit Wait    30        
openCK
    Open Browser    ${${Env}_URL}    ${Browser}
    Maximize Browser Window
    Input Text    ${Login_EmailId}    ${${Env}_Login_Id}
    Click Button    ${Login_Next}
    Input Text    ${Login_Password}    ${${Env}_Login_Pwd}
    Click Button    ${Login_SignIn}
    Wait Until Element Is Visible    ${Home_Learning}    30
    Capture Page Screenshot
    