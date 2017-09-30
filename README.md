# simple-jbatch-test

# deploy
EAP7_HOME/bin/standalone.sh
mvn clean package wildfly:deploy

# test
curl -X POST http://localhost:8080/jboss-batch-processing/rs/jbatch/start
curl -X POST http://localhost:8080/jboss-batch-processing/rs/jbatch/stop


# undeploy
mvn wildfly:undeploy

