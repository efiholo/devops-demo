pipeline {
    agent any

    stages {
        stage('Unit test') {
            steps {
                echo 'Unit testing'
            }
        }
        stage('Build') {
            steps {
                sh "docker build -t mynginx:${env.BUILD_ID} ."
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