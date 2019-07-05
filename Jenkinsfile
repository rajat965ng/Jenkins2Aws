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
    }
}
