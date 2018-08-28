pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'docker build'
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