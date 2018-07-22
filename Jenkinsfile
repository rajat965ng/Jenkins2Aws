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
            agent any
            steps {
                sh 'yum install libtool-libs -y'
                sh 'docker build -t rajat965ng/crickplay .'
                sh 'docker push rajat965ng/crickplay '
                sh 'docker rmi rajat965ng/crickplay '
            }
        }
    }
}