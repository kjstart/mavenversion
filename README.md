# Build with revision

mvn -Drevision=1.1.1 clean package

# Replace static version include submodules, require all original version are same.
- mvn versions:set -DnewVersion=2.50.1-SNAPSHOT –DprocessAllModules
- mvn versions:commit –DprocessAllModules

## All in one
mvn versions:set -DnewVersion=2.50.1-SNAPSHOT -DprocessAllModules -DgenerateBackupPoms=false

# Replace static version for single module project
- mvn versions:set -DnewVersion=2.50.1-SNAPSHOT  
- mvn versions:commit

# Revert version replacement before commit
mvn versions:revert
