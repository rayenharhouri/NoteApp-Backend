pipeline {

    agent any
    environment {
        SONAR_CREDENTIALS = credentials('433df826-ffaa-4cda-b2ba-f0bc2dcbaffe')

        }

    stages {

        stage('Checkout BackEnd Repository') {
            steps {
               git credentialsId: 'ce3d518d-c840-4136-8596-c0b7857a1a1e', url: 'https://github.com/rayenharhouri/NoteApp-BackEnd.git'
            }
        }
        stage('build') {
            steps {
                sh 'mvn clean compile'
            }
        }

    }
 }