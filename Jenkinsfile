properties([disableConcurrentBuilds()])

pipeline {
    agent {
        label "main"
    }

    options {
        timestamps()
    }

    environment {
        MAVEN_TEST=" test"
        MAVEN_BUILD="clean package -Dskiptest"
    }
    stages {
        stage('Test') {
            steps {
                withMaven(maven: 'MAVEN_ENV') {
                    sh "mvn ${MAVEN_TEST}"
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh "docker-compose up -d"
                    withMaven(maven: 'MAVEN_ENV') {
                        sh "mvn ${MAVEN_BUILD}"
                    }
                    // Сборка Docker образа
                    sh "docker build -t dzoms/user-service ."
                }
            }
        }
    }
}
