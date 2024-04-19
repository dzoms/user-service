pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Я работаю'
                script {
                def test = 2 + 2 > 3 ? 'cool' : 'not cool'
                    // Запуск тестов Maven
                    sh 'mvn test'
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
