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
            agent{
                docker {image 'docker:latest'}
            }
            steps {
                sh script: 'docker build -t rajat965ng/crickplay:v1 .', label: 'Creating Image'
            }
        }
    }
}
