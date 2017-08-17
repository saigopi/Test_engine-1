node('node') {
    pwd()
    stage('Git Checkout') {
    git 'https://github.com/Vaishnavij/Test_engine'
    }
    stage ('gradle') {
    tool name: 'gradle', type: 'gradle'
    }
    stage ( 'Gradle Test') {
        sh '~/gradle-4.1/bin/gradle test'    
      }
}
