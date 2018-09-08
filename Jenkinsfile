pipeline {
    agent any
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh "mvn clean install"
            }
        }

        stage ('Publish') {
            steps {
                sh 'docker build -t helloboot:"${git rev-parse --short HEAD}" .'
            }
        }

        stage ('Deploy') {
            steps {
                echo 'Deploy'
            }
        }


    }
}