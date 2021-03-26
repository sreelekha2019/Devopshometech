pipeline{
    agent{
        label'slave-one'
    }
        stages{
        stage('Git checkout'){
            steps{
                //git clone/pull
                git credentialsId: 'github', url: 'https://github.com/sreelekha2019/Devopshometech.git'
            }
        }
        stage('maven build'){
            steps{
                sh 'mvn clean package'
            }
        }
    }
}
