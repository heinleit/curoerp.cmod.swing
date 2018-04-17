@echo off
echo COMPILE SWING-API

mkdir "%cd%\compile" 
mkdir "%cd%\compile\swing-api" 
dir /s /B "%cd%\curo-module-swing-api\*.java" > compile\swing-api\sources.txt
"C:\Program Files\Java\jdk1.8.0_161\bin\javac" @compile\swing-api\sources.txt -d "%cd%\compile\swing-api" 
cd "%cd%\compile\swing-api" 
"C:\Program Files\Java\jdk1.8.0_161\bin\jar" cvf ..\swing-api.cmod.jar *
cd ..\..
pause







echo ALL JOBS DONE!
pause