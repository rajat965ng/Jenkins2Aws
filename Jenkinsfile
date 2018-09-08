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
                sh 'docker build -t rajat965ng/helloboot:v1 .'
                sh 'docker push rajat965ng/helloboot:v1'
            }
        }

        stage ('Deploy') {
            steps {
                echo 'Deploy'
            }
        }


    }
}