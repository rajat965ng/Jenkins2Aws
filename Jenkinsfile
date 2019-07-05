pipeline {
    agent none
    stages {
        stage('Test') {
            agent {
                docker { image 'maven:latest' }
            }
            steps {
                sh 'mvn clean test' 
            }
        }
        stage('Build') {
            agent {
                docker { image 'maven:latest' }
            }
            steps {
                sh 'mvn install -DskipTests'
            }
        }
        stage('Publish') {
            agent{
                docker {image 'docker:latest'}
            }
            steps {
                sh 'docker build -t rajat965ng/crickplay:v1'
            }
        }
    }
}
