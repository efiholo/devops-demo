pipeline {
    agent any

    stages {
        stage('Unit test') {
            steps {
                echo 'Unit testing'
                sh "whoami"
            }
        }
        stage('Build') {
            steps {
                sh "groups"
                sh "sudo docker build -t mynginx:${env.BUILD_ID} ."
                sh "Hello again"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing Staging ..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying Staging...'
            }
        }

    }
}