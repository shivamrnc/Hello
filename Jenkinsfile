pipeline {
    agent any
    tools{
        maven 'MAVEN_HOME'

    stages {
        stage('BuildTest') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
            bat 'mvn compile'
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
            bat 'mvn test -Dbrowser=localchrome'
                echo 'Deploying....'
            }
        }
    }

  

