#!/bin/sh

rm -rf ~/.m2/repository/ch/epfl/lienl/experimental/packaging/

# Install one version of the model, let's say ADA

pushd "model-ADA"
mvn --quiet install
popd

# Then install the algo 

pushd "algo"
mvn --quiet install
popd

# Finally, test the algo

pushd "using.algo1"
mvn --quiet compile
mvn --quiet exec:java -Dexec.mainClass="ch.epfl.lienl.experimental.packaging.B.mygroup.App"
# Hello, Ada! 
popd

# Test now with BOB installed, but without recompiling anything

rm -rf ~/.m2/repository/ch/epfl/lienl/experimental/packaging/B/mygroup/model/
pushd "model-BOB"
mvn --quiet install
popd

pushd "using.algo1"
mvn --quiet exec:java -Dexec.mainClass="ch.epfl.lienl.experimental.packaging.B.mygroup.App"
# Hello, Bob!
popd

# Test a second usage of the algo that require ADA

pushd "model-ADA"
mvn --quiet install
popd

pushd "using.algo2"
mvn --quiet compile
mvn --quiet exec:java -Dexec.mainClass="ch.epfl.lienl.experimental.packaging.B.mygroup.App"
# Hello, Ada!
popd


