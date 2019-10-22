#! /bin/sh

cd ../ic.ac.uk.xdrone.parent

./gradlew clean build -x test

cp ic.ac.uk.xdrone.web/build/libs/ic.ac.uk.xdrone.web-1.0.0-SNAPSHOT.war ../scripts/ROOT.war
