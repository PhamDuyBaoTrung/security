SET TOOLS_DIR = F:\projects\tools\apache-maven-3.3.9;
SET PROJECT_DIR = F:\projects\security;
SET JAVA_HOME = C:\Program Files\Java\jdk1.8.0_65;
SET M2_DIR = F:\projects\tools\apache-maven-3.3.9;
SET TOMCAT_DIR = F:\projects\tools\apache-tomcat-8.0.30;
SET PATH = %M2_DIR%\bin;%TOMCAT_DIR%\bin;%JAVA_HOME%\bin;%PATH%;

call java -version;
call mvn -version;