$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddGroupChat.feature");
formatter.feature({
  "line": 2,
  "name": "Group Chat Cicle",
  "description": "User start chating in group chat cicle",
  "id": "group-chat-cicle",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@GroupChat"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Start chating with valid Data",
  "description": "",
  "id": "group-chat-cicle;start-chating-with-valid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@PositiveCase1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User already login with gmail account",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User select team card",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User choose group chat feature",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be navigated to the group chat page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User send \"\u003cchat\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "The chat have been send",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "group-chat-cicle;start-chating-with-valid-data;",
  "rows": [
    {
      "cells": [
        "chat"
      ],
      "line": 15,
      "id": "group-chat-cicle;start-chating-with-valid-data;;1"
    },
    {
      "cells": [
        "Hi All, apa kabs nih?"
      ],
      "line": 16,
      "id": "group-chat-cicle;start-chating-with-valid-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4718655000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Start chating with valid Data",
  "description": "",
  "id": "group-chat-cicle;start-chating-with-valid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@PositiveCase1"
    },
    {
      "line": 1,
      "name": "@GroupChat"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User already login with gmail account",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User select team card",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User choose group chat feature",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be navigated to the group chat page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User send \"Hi All, apa kabs nih?\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "The chat have been send",
  "keyword": "Then "
});
formatter.match({
  "location": "GroupChatSteps.setLoginGmail()"
});
formatter.result({
  "duration": 4321113900,
  "status": "passed"
});
formatter.match({
  "location": "GroupChatSteps.selectTeamCard()"
});
formatter.result({
  "duration": 1056861200,
  "status": "passed"
});
formatter.match({
  "location": "GroupChatSteps.selectGroupChatFeature()"
});
formatter.result({
  "duration": 98711300,
  "status": "passed"
});
formatter.match({
  "location": "GroupChatSteps.GroupChatPage()"
});
formatter.result({
  "duration": 335327600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hi All, apa kabs nih?",
      "offset": 11
    }
  ],
  "location": "GroupChatSteps.sendChat(String)"
});
formatter.result({
  "duration": 257418300,
  "status": "passed"
});
formatter.match({
  "location": "GroupChatSteps.verifyChat()"
});
formatter.result({
  "duration": 27400700,
  "status": "passed"
});
});