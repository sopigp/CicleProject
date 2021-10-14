$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddDocs\u0026Files.feature");
formatter.feature({
  "line": 2,
  "name": "Docs \u0026 Files Cicle",
  "description": "User can upload files/docs in cicle",
  "id": "docs-\u0026-files-cicle",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DocsFiles"
    }
  ]
});
formatter.before({
  "duration": 7478991600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#\t@PositiveCase1"
    },
    {
      "line": 6,
      "value": "#\tScenario Outline: Create new folder \u0026 new document"
    },
    {
      "line": 7,
      "value": "#\t\tGiven User already login in Cicle Website"
    },
    {
      "line": 8,
      "value": "#\t\tWhen User select team"
    },
    {
      "line": 9,
      "value": "#\t\tAnd User choose docs \u0026 files feature"
    },
    {
      "line": 10,
      "value": "#\t\tThen User should be navigated to the docs \u0026 files page"
    },
    {
      "line": 11,
      "value": "#\t\tAnd User create new folder with \"\u003cfolderName\u003e\" as folder name"
    },
    {
      "line": 12,
      "value": "#\t\tAnd User add new doc on the folder that have been created with \"\u003ctitleDoc\u003e\" as title document and \"\u003cdescDoc\u003e\" as body document"
    },
    {
      "line": 13,
      "value": "#\t\tAnd User publish the document"
    },
    {
      "line": 14,
      "value": "#\t\tThen The document already created \u0026 published"
    },
    {
      "line": 15,
      "value": "#"
    },
    {
      "line": 16,
      "value": "#\t\tExamples:"
    },
    {
      "line": 17,
      "value": "#\t\t\t|\t\tfolderName\t\t\t\t\t\t|\t\ttitleDoc\t\t\t\t\t\t\t\t\t\t\t| \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdescDoc\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|"
    },
    {
      "line": 18,
      "value": "#\t\t\t|\t\tWFH Terms \u0026 Conditions|\t\tAturan WFH PT Cilsy Foilution\t|\tWajib mengikuti online meeting setiap hari kerja jam 08.00 - 10.00 WIB menggunakan google meet dengan account yang telah terdaftar oleh PT Cilsy Fioulution\t|"
    }
  ],
  "line": 21,
  "name": "Upload files/docs with valid extention \u0026 size",
  "description": "",
  "id": "docs-\u0026-files-cicle;upload-files/docs-with-valid-extention-\u0026-size",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@PositiveCase2"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "User already login in Cicle Website",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User select team",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User choose docs \u0026 files feature",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User should be navigated to the docs \u0026 files page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User choose folder to upload \"fototesting.jpg\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "The file already uploaded \u0026 published",
  "keyword": "Then "
});
formatter.match({
  "location": "DocsFilesSteps.setLoginGmail()"
});
formatter.result({
  "duration": 4842570400,
  "status": "passed"
});
formatter.match({
  "location": "DocsFilesSteps.selectTeamCard()"
});
formatter.result({
  "duration": 1912219700,
  "status": "passed"
});
formatter.match({
  "location": "DocsFilesSteps.selectDocsFilesFeature()"
});
formatter.result({
  "duration": 169822800,
  "status": "passed"
});
formatter.match({
  "location": "DocsFilesSteps.DocsFilesPage()"
});
formatter.result({
  "duration": 573465400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fototesting.jpg",
      "offset": 30
    }
  ],
  "location": "DocsFilesSteps.chooseFolder(String)"
});
formatter.result({
  "duration": 3633961700,
  "status": "passed"
});
formatter.match({
  "location": "DocsFilesSteps.fileUploaded()"
});
formatter.result({
  "duration": 2000300,
  "status": "passed"
});
});