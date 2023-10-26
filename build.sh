#!/bin/bash

container_size=$1

# Clean the current target dir
rm -r target/
rm -r artifacts/$container_size
# Build the source code into a single .jar file including all the dependencies. Generates source.jar also inside the target dir.
mvn clean install

# Copy the artifacts
mkdir -p artifacts/$container_size
cp target/size-expt-1.0.jar artifacts/$container_size/size-expt-$container_size.jar
