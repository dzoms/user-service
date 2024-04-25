properties([disableConcurrentBuilds()])

pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    
    environment {
        MAVEN_TEST="test"
        MAVEN_BUILD="clean package -Dskiptest"
    }
    stages {
        stage('Test') {
            agent {
                docker {
                    image "openjdk:21"
                    args "-v $HOME/.m2:/root/.m2"
                }
            }
            steps {
                sh "./mvnw ${MAVEN_TEST}"
            }
        }

        stage('Build Docker Image') {
            steps {
                sh "docker-compose up -d"
                sh "mvn ${MAVEN_BUILD}"
                // Сборка Docker образа
                sh "docker build -t dzoms/user-service"
            }
        }
    }
}
