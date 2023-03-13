pipeline{
    agent any
    tools{
        maven "Maven"
    }
    stages{
        stage("Clean Maven"){
            steps{
                git branch: 'main', url: 'https://github.com/tanzeelsultanrana/maven-java-samples.git'
               // checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/tanzeelsultanrana/maven-java-samples.git']])
                sh "mvn clean"
            }
        }
        stage("Compile Maven"){
            steps{
                //checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/tanzeelsultanrana/maven-java-samples.git']])
                sh "mvn compile"
            }
        }
        stage("Test Maven"){
            steps{
                //checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/tanzeelsultanrana/maven-java-samples.git']])
                sh "mvn test"
            }
        }
        stage("Package Maven"){
            steps{
                //checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/tanzeelsultanrana/maven-java-samples.git']])
                sh "mvn package"
                echo "automation on next push"
            }
        }
         stage('Sonar Quality Checks'){
        steps{
            script{
              withSonarQubeEnv(installationName: 'sonar-latest',credentialsId: 'SONAR-KEY') {
              sh 'mvn sonar:sonar'
              }  
              timeout(time : 1, unit : 'HOURS') {
                def qg = waitForQualityGate()
                if (qg.status != 'OK') {
                    error "Pipeline aborted due to quality gate failure: ${qb.status}"
                }
              }      
            }
          }
        }
    }
}
