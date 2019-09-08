$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/JobTitle.feature");
formatter.feature({
  "name": "Job Titles",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged into OrangeHRM",
  "keyword": "Given "
});
formatter.match({
  "location": "JobTitleSteps.i_logged_into_OrangeHRM()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Job Titles",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@jobTitle"
    }
  ]
});
formatter.step({
  "name": "I click on Admin",
  "keyword": "And "
});
formatter.match({
  "location": "JobTitleSteps.i_click_on_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Job",
  "keyword": "And "
});
formatter.match({
  "location": "JobTitleSteps.i_click_on_Job()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Job Titles",
  "keyword": "And "
});
formatter.match({
  "location": "JobTitleSteps.i_click_on_Job_Titles()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add Job Title",
  "keyword": "And "
});
formatter.match({
  "location": "JobTitleSteps.i_click_on_Add_Job_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide job title \"QAA\", and descriptions \"Automates Web Browsers\" and upload file with job specifications \"/Users/mahri/Desktop/JobSpecifications.pdf\"",
  "keyword": "When "
});
formatter.match({
  "location": "JobTitleSteps.i_provide_job_title_and_descriptions_and_upload_file_with_job_specifications(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "JobTitleSteps.i_click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see job title \"\u003cQAA\u003e\" is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "JobTitleSteps.i_see_job_title_is_added_successfully(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});