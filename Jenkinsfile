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
                sh 'docker build -t helloboot:v1 .'
                sh 'docker login -u rajat965ng -p deepa@16'
                sh 'docker push helloboot:v1'
            }
        }

        stage ('Deploy') {
            steps {
                echo 'Deploy'
            }
        }


    }
}