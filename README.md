# Java JSON Merge patch example application  
  
Sample application for com.hubbledouble.json-merge-patch  
[https://github.com/hubbledouble/json-merge-patch](https://github.com/hubbledouble/json-merge-patch)  

### Requirements
- Java Development Kit 8 (JDK 8)
- Maven (Optional)
- Postman 

### Steps to execute
1. Clone project (git clone https://github.com/hubbledouble/json-merge-patch-example.git)
2. Go inside the folder just cloned "json-merge-patch"
3. Build project  
   - If maven is installed, execute : mvn clean package
   - If maven is not installed, but in UNIX system then : ./mvnw clean package
   - If maven is not installed, but in WINDOWS system then : ./mvnw.cmd clean install
4. A new directory will be created called "target". Go to "target" folder.
5. Run application by executing : java -jar json-merge-patch-example-1.0.jar
6. Open Postman 
7. Import Postman collection "json-merge-patch.postman_collection.json"
8. Hit GET endpoints, followed by PATCH endpoints
8. Have fun!
