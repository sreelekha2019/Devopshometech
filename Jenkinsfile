pipeline{
    agent any
    stages{
        stage('Git checkout'){
            steps{
                //git clone/pull
                git credentialsId: 'github', url: 'https://github.com/sreelekha2019/Devopshometech.git'
            }
        }
    }
}
