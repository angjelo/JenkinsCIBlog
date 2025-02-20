pipeline {
    agent any

    stages {
        stage('Compile Stage') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Build') {
            steps {
                sh 'echo "Building the project"'
            }
        }

        stage('Testing Stage') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
