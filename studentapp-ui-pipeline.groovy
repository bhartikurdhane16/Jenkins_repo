pipeline{
    agent any

    stages{
        stage ('pull'){
            steps{
                git changelog: false, poll: false, url: 'https://github.com/bhartikurdhane16/studentapp.ui.git'
                echo 'pull succssed'
            }
        }

        stage ('build'){
            steps{
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
                echo 'build successed'
            }
        }

        stage ('test'){
            steps{
                echo 'test stage'
            }
        }

        stage ('deploy'){
            steps{
                echo 'deploy stage'
            }
        }
    }

}