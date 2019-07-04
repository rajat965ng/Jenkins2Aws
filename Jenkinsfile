pipeline {
    agent {
        docker { image 'maven:latest', args: '-v $PWD/app:/app' }
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
        stage('Package') {
            agent any
            steps {
                sh 'docker build -t crickplay:v1 .'
            }
        }
    }
}
