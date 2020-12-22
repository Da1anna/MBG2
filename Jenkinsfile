pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building..'
        sh './mvnw clean package'
      }
    }

    stage('Test') {
      steps {
        echo 'testing is pass for now'
      }
    }

    stage('Deploy') {
      steps {
        echo 'docker build'
        sh 'docker build -t mbg2:jenkins .'
        echo 'docker run'
        sh 'docker run --rm -p 8090:8080 --name=mbg2_jenkins -d mbg2:jenkins'
      }
    }
  }
}