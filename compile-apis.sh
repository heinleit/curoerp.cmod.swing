mkdir ./compile
mkdir ./compile/swing-api

cd curo-module-swing-api
find $PWD -name "*.java" > ../compile/swing-api/sources.txt
cd ../compile/swing-api
javac @sources.txt -d $PWD
jar cvf ../swing-api.cmod.jar *


