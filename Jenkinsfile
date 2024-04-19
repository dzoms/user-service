pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Запуск тестов Maven
                    sh 'mvn test'
                }
                script {
                    sh 'echo "Я работаю"'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Сборка Docker образа
                    sh 'docker build -t dzoms/user-service .'
                }
            }
        }
    }
}
