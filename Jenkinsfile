node('node') {
    // some block
    pwd()
    stage('checkout') {
    // some block
    git 'https://github.com/Vaishnavij/Test_engine'
    }
    stage ('gradle') {
    // some block
    tool name: 'gradle', type: 'gradle'
    }
    stage ( 'shrun') {
        echo "This time, the Gradle version"
        sh '~/gradle-4.1/bin/gradle test'
      }
}