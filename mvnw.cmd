@REM
@REM Copyright 2007 The Apache Software Foundation.
@REM
@REM Licensed under the Apache License, Version 2.0 (the "License");
@REM you may not use this file except in compliance with the License.
@REM You may obtain a copy of the License at
@REM
@REM     http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing, software
@REM distributed under the License is distributed on an "AS IS" BASIS,
@REM WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@REM See the License for the specific language governing permissions and
@REM limitations under the License.

@IF "%MAVEN_SKIP_RC%" == "" @
@call :chkMHome
@IF ERRORLEVEL 1 @
@call "%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config" %MAVEN_CMD_LINE_ARGS%
@goto :continue

@:chkMHome
@REM Check for Maven home defined inside Maven wrapper distribution
@IF "%MAVEN_HOME%" == "" (
  @SET MAVEN_HOME=%~dp0\.mvn\wrapper\maven-wrapper
)

@:continue
@set CMD_LINE_ARGS=%*
@set MAVEN_JAVA_EXE="%JAVA_HOME%\bin\java.exe"
@set WRAPPER_JAR="%MAVEN_HOME%\maven-wrapper.jar"
@set WRAPPER_PROPS="%MAVEN_HOME%\maven-wrapper.properties"
@set WRAPPER_LOG="%MAVEN_HOME%\maven-wrapper.log"

@if exist %MAVEN_JAVA_EXE% (
  if exist %WRAPPER_JAR% (
    %MAVEN_JAVA_EXE% %MAVEN_OPTS% -classpath %WRAPPER_JAR% -Dmaven.multiModuleProjectDirectory="%MAVEN_PROJECTBASEDIR%" org.apache.maven.wrapper.MavenWrapperMain %CMD_LINE_ARGS%
  ) else (
    @echo Could not locate maven-wrapper.jar, using basic mvn commands
    @call mvn %CMD_LINE_ARGS%
  )
) else (
  @echo Could not locate java.exe, please check JAVA_HOME
)