pipeline {
    agent {
        docker { image 'maven:latest' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'docker run -v $PWD/app:/app maven mvn clean test'
            }
        }
        stage('Build') {
            steps {
                sh 'docker run -v $PWD/app:/app maven mvn install -DskipTests'
            }
        }
        stage('Package') {
            agent any
            steps {
                sh 'docker build -t crickplay:v1 .'
            }
        }
    }
}
