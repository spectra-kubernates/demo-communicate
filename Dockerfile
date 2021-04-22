FROM openjdk:8-jdk-alpine
EXPOSE 8101
ADD target/*.war kubernatesbasicssql.war
ENTRYPOINT ["sh", "-c", "java -jar /kubernatesbasicssql.war"]