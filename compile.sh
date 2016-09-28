#!/usr/bin/env bash
echo "Compiling..."
scalac -Xplugin:/Users/ollie/.ivy2/local/org.scalameta/paradise_2.11.8/4.0.0-SNAPSHOT/jars/paradise_2.11.8.jar -Dpersist.enable -Ybackend:GenBCode Hello.scala
echo "Done!"

