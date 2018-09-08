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
                echo 'Hello World'
            }
        }

        stage ('Publish') {
            steps {
                echo 'Publish'
            }
        }

        stage ('Deploy') {
            steps {
                echo 'Deploy'
            }
        }


    }
}