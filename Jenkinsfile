pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
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

    when {
        // Определяем, что запускать только при изменениях в репозитории
        changeset '.*'
    }
}
