# mavenversion

mvn -Drevision=1.1.1 clean package

# to replace static version include submodules
mvn versions:set -DnewVersion=2.50.1-SNAPSHOT –DprocessAllModules
mvn versions:commit –DprocessAllModules

## all in one
mvn versions:set -DnewVersion=2.50.1-SNAPSHOT -DprocessAllModules -DgenerateBackupPoms=false

# to replace static version for single module project
mvn versions:set -DnewVersion=2.50.1-SNAPSHOT
mvn versions:commit

# to revert version replacement before commit
mvn versions:revert
