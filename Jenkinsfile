pipeline {
    agent {
        docker { image 'maven:latest' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn install -DskipTests'
            }
        }
        stage('Publish') {
            agent {
                dockerfile true
            }
            steps {
                echo 'Docker build complete'
            }
        }
    }
}