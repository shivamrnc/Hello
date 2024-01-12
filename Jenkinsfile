pipeline {
    agent any
    tools{
        maven 'MAVEN_HOME'
    }

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
                publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: '', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: '', useWrapperFileDirectly: true])
                echo 'Deploying....'
            }
        }
        stage('clean'){
            steps{
                     
        always {
            cleanWs()
        }
       
            }
        }
        
    }
}

  

