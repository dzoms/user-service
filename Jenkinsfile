properties([disableConcurrentBuilds()])

pipeline {
    agent any
    
    environment {
        MAVEN_TEST="test"
        MAVEN_BUILD="clean package -Dskiptest"
    }
    stages {
        stage('Test') {
            agent {
                docker {
                    image 'maven:3.9.6'
                }
            }
            steps {
                sh "mvn ${MAVEN_TEST}"
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh "docker-compose up -d"
                    sh "mvn ${MAVEN_BUILD}"
                    // Сборка Docker образа
                    sh "docker build -t dzoms/user-service ."
                }
            }
        }
    }
}
