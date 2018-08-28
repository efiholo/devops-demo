pipeline {
    agent any

    stages {
        stage checkout {
            checkout scm
        }
        stage('Unit test') {
            steps {
                echo 'Unit testing'
            }
        }
        stage('Build') {
            steps {
                def customImage = docker.build("my-nginx:${env.BUILD_ID}")
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