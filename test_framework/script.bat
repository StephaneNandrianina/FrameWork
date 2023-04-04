cd framework2/WEB-INF/classes
jar cfv Framework.jar ./*
move Framework.jar ../../../test_framework/WEB-INF/lib/
cd ../../../
cd test_framework/WEB-INF/classes
javac -cp ../lib/Framework.jar -d . *.java
cd ../../../
cd test_framework
jar cfv test_framework.war ./*
move test_framework.war ../../
pause