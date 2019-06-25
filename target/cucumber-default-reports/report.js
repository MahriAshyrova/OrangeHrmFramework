$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@addEmployee"
    }
  ]
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
  "name": "I logged into OrangeHrm",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_logged_into_OrangeHrm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on PIM link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_PIM_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add Employee link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_Add_Employee_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee Labels Verifications",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addEmployee"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@temp"
    }
  ]
});
formatter.step({
  "name": "I see the following labels",
  "rows": [
    {
      "cells": [
        "First Names"
      ]
    },
    {
      "cells": [
        "Middle Name"
      ]
    },
    {
      "cells": [
        "Last Name"
      ]
    },
    {
      "cells": [
        "Employee Id"
      ]
    },
    {
      "cells": [
        "Location"
      ]
    },
    {
      "cells": [
        "Create Login Details"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_the_following_labels(DataTable)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat com.orangehrm.stepDefinitions.AddEmployeeSteps.i_see_the_following_labels(AddEmployeeSteps.java:79)\n\tat ✽.I see the following labels(file:src/test/resources/features/AddEmployee.feature:36)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});