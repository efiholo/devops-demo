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
                sh 'docker build -t mynxing . '
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