pipeline {
    agent none
    stages {
        stage('Test & Build') {
            agent {
                docker { image 'maven:latest' }
            }
            steps {
                sh script: 'mvn clean test', label: 'Test' 
                sh script: 'mvn install -DskipTests', label: 'Build'
            }
        }
        stage('Publish') {
            agent none
            steps {
                sh script: 'docker build -t rajat965ng/crickplay:v1 .', label: 'Creating Image'
            }
        }
        stage('Push'){
            agent none
            steps {
                sh script: 'docker push rajat965ng/crickplay:v1', label: 'Pushing into registry' 
            }
        }
    }
}
