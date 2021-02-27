cd C:\Users\Administrator\Documents\NetBeansProjects\mavenproject1; "JAVA_HOME=C:\\Program Files\\Java\\jdk-15.0.2" cmd /c "\"C:\\Program Files\\NetBeans-12.1\\netbeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.args=\"-classpath %classpath InputFromKeyboard\" -Dexec.executable=\"C:\\Program Files\\Java\\jdk-15.0.2\\bin\\java.exe\" -Dmaven.ext.class.path=\"C:\\Program Files\\NetBeans-12.1\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar\" -Dfile.encoding=UTF-8 org.codehaus.mojo:exec-maven-plugin:1.5.0:exec"
Running NetBeans Compile On Save execution. Phase execution is skipped and output directories of dependency projects (with Compile on Save turned on) will be used instead of their jar artifacts.
Scanning for projects...

--------------------< com.mycompany:mavenproject1 >---------------------
Building mavenproject1 1.0-SNAPSHOT
--------------------------------[ jar ]---------------------------------

--- exec-maven-plugin:1.5.0:exec (default-cli) @ mavenproject1 ---
What's your name?
Khang
How old are you?
21
How tall are you (m)?
175
Mrs/Ms. Khang, 21 years old. Your height is 175.0. 
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  23.520 s
Finished at: 2021-02-27T19:01:34+07:00
------------------------------------------------------------------------
