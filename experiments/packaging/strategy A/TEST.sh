#/bin/sh

 
## cd ..../dependencyProject/

rm -rf ~/.m2/repository/mygroup

#First install basic module. Ada and Bob depend on it:
cd modeldep/
mvn install

#Then build Ada and Bob:
cd ../ada/
mvn install
cd ../bob/
mvn install

#Algo has test-scope dependencies to Ada and Bob
cd ../algo/
mvn install

#UsingMyAlgo has "main-scope" dependencies to Ada
cd ../using_my_algo/
mvn install
