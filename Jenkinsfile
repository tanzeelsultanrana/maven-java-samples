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
            post {
                always {
                        // One or more steps need to be included within each condition's block.
                        }
                 }
        }
    }
}
