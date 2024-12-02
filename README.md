# Build Project Using 
- Command `mvn clean install`

# Cobol Execution Steps 
- Install GnuCOBOL
- Change Directory to Cobol Source `cd src/main/cobol`
- Compile using `cobc -free -x -o welcome.so welcome.cobol`
- Execute using `./welcome.so`

# Loading TestRig
- mvn exec:java