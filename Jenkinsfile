pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('build Dockerfile') {
            steps {
                sh 'docker build -t api .'
            }
        }

        stage('kill Docker container') {
            steps {
                sh 'docker container rm -f tomcat-api'
            }
        }

        stage('Run docker container') {
            steps {
                sh 'docker container run -d -p 87:8080 --name tomcat-api api'
            }
        }

    }
}

