# Maven

## What is Maven?

Maven is a build automation tool used primarily for Java projects. Maven can also be used to build and manage projects written in C#, Ruby, Scala, and other languages. The Maven project is hosted by the Apache Software Foundation, where it was formerly part of the Jakarta Project.

## Why Maven?

Maven is a powerful project management tool that is based on POM (project object model). It is used for projects build, dependency and documentation. It simplifies the build process like ANT. But it is too much advanced than ANT.

## Features of Maven

- Simple project setup that follows best practices - get a new project or module started in seconds
- Consistent usage across all projects - means no ramp up time for new developers coming onto a project
- It provides a uniform build system which is independent of any IDE
- Maven's dependency management system is one of the best among build tools
- Compatible with other build tools like ANT
- Extensible, with the ability to easily write plugins in Java or scripting languages
- Instant access to new features with little or no extra configuration
- It provides uniform ways to handle output directories and library dependencies
- Maven can be integrated with various IDE like Eclipse, Netbeans, IntelliJ etc.
- It provides command line utility to perform some common tasks like compiling and unit testing.
- It provides effective release management and issue management.
- It provides dependency management using its extensive repositories.
- It provides a uniform build system which is independent of any IDE.
- It provides a large and growing repository of libraries (more than 60,000).

## Maven Repository

Maven repository is a directory of packaged JAR file with pom.xml. When we run any Maven command, then Maven automatically downloads all the dependency jars into the local repository. The local repository is located in the .m2 directory of the user's home directory. The local repository contains remote dependencies, which are jars from external dependencies that are required for the project. The local repository also contains all the project specific jars, plugins, and other build artifacts. The local repository acts as a cache for downloaded dependencies. If a dependency has been downloaded once, then it is stored in the local repository, and Maven will not download it again.

## Maven Plugins

Maven plugins are used to:

- create jar file
- create war file
- compile code
- unit test code
- create project documentation
- create project reports
- deploy project etc.
- Maven plugins are used to interact with Maven lifecycle. Maven lifecycle has three built-in lifecycle namely default, clean and site. The default lifecycle handles your project deployment, the clean lifecycle handles project cleaning, and the site lifecycle handles the creation of your project's site documentation.
- Maven plugins are the same as ANT tasks. The only difference is that ANT tasks are static and Maven plugins are executed during the build lifecycle.
  
## Maven Build Lifecycle

Maven build lifecycle is a sequence of build phases, whereas a build phase is a sequence of build goals. A build goal represents a specific task that contributes to the building and managing of a project. It may be bound to zero or more build phases. A build phase is responsible for a specific step in the build lifecycle. Generally, a build phase is not bound to a specific goal. But, a build phase can be bound to zero or more goals. For example, the compile phase is bound to the compile goal, the test phase is bound to the test goal, and so on.

## Maven Build Profiles

Maven build profiles are used to customize build configurations for different environments such as Production v/s Development environments. It is used to create different types of build artifacts for different environments. For example, we can create a WAR file for the production environment and a JAR file for the development environment. We can also use build profiles to create different types of build artifacts for different operating systems. For example, we can create a Windows executable file for the Windows operating system and a Linux executable file for the Linux operating system.

## Maven Archetype

Maven archetype is a template that provides a project's basic structure. It contains the directory structure and basic files. It is used to create a new project. Maven provides a number of archetypes that can be used to create different types of Java projects. For example, maven-archetype-quickstart archetype is used to create a simple Java project, maven-archetype-webapp archetype is used to create a simple Java web application project, and so on.

## Maven Dependency

Maven dependency is another project (or jar) that your project depends on. For example, if your project needs the Hibernate library, then you will declare the Hibernate dependency in your project's pom.xml file. When you build your project, Maven will automatically download all the required dependencies from the central repository and put them in your project's classpath.

## Configuring Maven

### Maven Installation

- Download the latest version of Maven from the [Maven official website](https://maven.apache.org/download.cgi).
- Unzip the distribution archive to the directory you wish to install Maven. These instructions assume you chose C:\Program Files\Apache Software Foundation. The subdirectory apache-maven-3.6.3 will be created from the archive.
- Add the M2_HOME environment variable by opening up the system properties (WinKey + Pause), selecting the "Advanced" tab, and the "Environment Variables" button, then adding the M2_HOME variable in the user variables with the value C:\Program Files\Apache Software Foundation\apache-maven-3.6.3. Be sure to omit any quotation marks around the path even if it contains spaces. Note: For Maven 2.0.9, also be sure that the M2_HOME doesn't have a '\' as last character.
- In the same dialog, add the M2 environment variable in the user variables with the value %M2_HOME%\bin.
- Optional: In the same dialog, add the MAVEN_OPTS environment variable in the user variables to specify JVM properties, e.g. the value -Xms256m -Xmx512m. This environment variable can be used to supply extra options to Maven.
- In the same dialog, update/create the Path environment variable in the user variables and prepend the value %M2% to add Maven available in the command line.
- In the same dialog, make sure that JAVA_HOME exists in your user variables or in the system variables and it is set to the location of your JDK, e.g. C:\Program Files\Java\jdk1.7.0_06 and that %JAVA_HOME%\bin is in your Path environment variable. Open a new command prompt (Winkey + R then type cmd) and run mvn --version to verify that it is correctly installed.
- Restart Eclipse and you are done.

### Maven Project Creation

- Open Eclipse IDE and click on File > New > Other > Maven > Maven Project.
- Click on Next button.
- Select the workspace location and click on Next button.
- Select the archetype and click on Next button.
- Enter the Group Id, Artifact Id, and click on Finish button.
- The project will be created in the workspace.
- The pom.xml file will be opened in the editor.
- The pom.xml file contains the project configuration details, such as project dependencies, build directory, source directory, test source directory, plugin, goals etc.
- Now, you can add the required dependencies in the pom.xml file and build the project.

### Maven Project Structure

- src/main/java: contains java source files.
- src/test/java: contains test source files.
- src/test/resources: contains test resources such as properties files, XML files etc.
- pom.xml: contains project configuration details, such as project dependencies, build directory, source directory, test source directory, plugin, goals etc.
- target: contains build output.
- mvnw: is a wrapper script. It is used to build the project without having to install Maven.

### Maven Build

- Open Eclipse IDE and click on Run > Run Configurations.
- Select Maven Build and click on New button.
- Enter the name of the configuration and click on Browse Workspace button.
- Select the project and click on OK button.
- Enter the goal and click on Apply button.
- Click on Run button.
- The project will be built and the output will be displayed in the console.
- The build output will be generated in the target directory.
- The build output contains the compiled classes, jar file, war file etc.

### Maven Clean

- Open Eclipse IDE and click on Run > Run Configurations.
- Select Maven Build and click on New button.
- Enter the name of the configuration and click on Browse Workspace button.
- Select the project and click on OK button.
- Enter clean in the goal field.
- Click on Apply button.

## Conclusion:

In this tutorial, we have learned about Maven, its features, build lifecycle, build profiles, archetypes, dependency, and how to configure Maven in Eclipse IDE. We have also learned how to create a Maven project, Maven project structure, and how to build and clean a Maven project. 