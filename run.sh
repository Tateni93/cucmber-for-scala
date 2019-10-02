#!/bin/bash
sbt -Dbrowser=chrome 'testOnly utils.runners.RunTest'