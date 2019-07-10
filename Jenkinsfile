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
            agent any
            steps {
                sh script: 'docker build -t eu.gcr.io/sape-rbs-gcp-poc/crickplay:latest .', label: 'Creating Image'
            }
        }
        stage('Push'){
            agent any
            steps {
                sh script: 'docker push eu.gcr.io/sape-rbs-gcp-poc/crickplay:latest', label: 'Pushing into registry'
                sh script: 'docker rmi eu.gcr.io/sape-rbs-gcp-poc/crickplay:latest', label: 'Image clean up'
            }
        }
    }
}
