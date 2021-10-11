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
formatter.scenarioOutline({
  "line": 6,
  "name": "Upload files/docs with valid extention \u0026 size",
  "description": "",
  "id": "docs-\u0026-files-cicle;upload-files/docs-with-valid-extention-\u0026-size",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@PositiveCase"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User already login in Cicle Website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User select team",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User choose docs \u0026 files feature",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be navigated to the docs \u0026 files page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User create new folder with \"\u003cfolderName\u003e\" as folder name",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User add new doc on the folder that have been created with \"\u003ctitleDoc\u003e\" as title document and \"\u003cdescDoc\u003e\" as body document",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User publish the document",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "The document already created \u0026 published",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "docs-\u0026-files-cicle;upload-files/docs-with-valid-extention-\u0026-size;",
  "rows": [
    {
      "cells": [
        "folderName",
        "titleDoc",
        "descDoc"
      ],
      "line": 17,
      "id": "docs-\u0026-files-cicle;upload-files/docs-with-valid-extention-\u0026-size;;1"
    },
    {
      "cells": [
        "WFH Terms \u0026 Conditions",
        "Aturan WFH PT Cilsy Foilution",
        "Wajib mengikuti online meeting setiap hari kerja jam 08.00 - 10.00 WIB menggunakan google meet dengan account yang telah terdaftar oleh PT Cilsy Fioulution"
      ],
      "line": 18,
      "id": "docs-\u0026-files-cicle;upload-files/docs-with-valid-extention-\u0026-size;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5380898700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Upload files/docs with valid extention \u0026 size",
  "description": "",
  "id": "docs-\u0026-files-cicle;upload-files/docs-with-valid-extention-\u0026-size;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@DocsFiles"
    },
    {
      "line": 5,
      "name": "@PositiveCase"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User already login in Cicle Website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User select team",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User choose docs \u0026 files feature",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be navigated to the docs \u0026 files page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User create new folder with \"WFH Terms \u0026 Conditions\" as folder name",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User add new doc on the folder that have been created with \"Aturan WFH PT Cilsy Foilution\" as title document and \"Wajib mengikuti online meeting setiap hari kerja jam 08.00 - 10.00 WIB menggunakan google meet dengan account yang telah terdaftar oleh PT Cilsy Fioulution\" as body document",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User publish the document",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "The document already created \u0026 published",
  "keyword": "Then "
});
formatter.match({
  "location": "DocsFilesSteps.setLoginGmail()"
});
formatter.result({
  "duration": 4615910800,
  "status": "passed"
});
formatter.match({
  "location": "DocsFilesSteps.selectTeamCard()"
});
formatter.result({
  "duration": 1483665900,
  "status": "passed"
});
formatter.match({
  "location": "DocsFilesSteps.selectDocsFilesFeature()"
});
formatter.result({
  "duration": 132875300,
  "status": "passed"
});
formatter.match({
  "location": "DocsFilesSteps.DocsFilesPage()"
});
formatter.result({
  "duration": 565617000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WFH Terms \u0026 Conditions",
      "offset": 29
    }
  ],
  "location": "DocsFilesSteps.sendChat(String)"
});
formatter.result({
  "duration": 895854400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aturan WFH PT Cilsy Foilution",
      "offset": 60
    },
    {
      "val": "Wajib mengikuti online meeting setiap hari kerja jam 08.00 - 10.00 WIB menggunakan google meet dengan account yang telah terdaftar oleh PT Cilsy Fioulution",
      "offset": 114
    }
  ],
  "location": "DocsFilesSteps.addNewDoc(String,String)"
});
formatter.result({
  "duration": 2257237300,
  "status": "passed"
});
formatter.match({
  "location": "DocsFilesSteps.publishDoc()"
});
formatter.result({
  "duration": 112151900,
  "status": "passed"
});
formatter.match({
  "location": "DocsFilesSteps.docCreated()"
});
formatter.result({
  "duration": 105024800,
  "status": "passed"
});
});