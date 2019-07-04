pipeline {
    agent {
        docker { image 'maven:latest' }
    }
    stages {
        stage('Initialize'){
            steps{
                script{
                    def dockerHome = tool 'mydocker'
                    env.PATH = "${dockerHome}/bin:${env.PATH}"
                }
            }
        }
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
            steps{
                script{
                app = docker.build("rajat965ng/crickplay")
                docker.withRegistry('https://registry.hub.docker.com', 'rajat965ng') {
                      app.push("${env.BUILD_NUMBER}")
                      app.push("latest")
                  }
                }
            }
        }
    }
}
