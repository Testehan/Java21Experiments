Useful SdkMan commands:
List Versions
To get a listing of Candidate Versions:
$ sdk list java                     (if you check the Status column, you will see the ones that are installed)

Specific Version
Need a specific version of an SDK? Simply qualify the version you require:
$ sdk install scala 3.3.1

Home
When using SDKMAN in scripts, it is often useful to get the absolute path of where an SDK resides (similar to
how the java_home command works on macOS). For this we have the home command.
$ sdk home java 17.0.8.1-tem

Remove Version
Remove an installed version.
$ sdk uninstall scala 3.3.1
Note that removing a local version will not remove the local installation

Default Version
Chose to make a given version the default:
$ sdk default scala 3.3.1
This will ensure that all subsequent shells will start with version 3.3.1 in use.

Current Version(s)
To see what is currently in use for a Candidate
$ sdk current java