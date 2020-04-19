node {
    stage('SCM') {
	echo 'Gathering code from version control'
    }
    stage('Build') {
	echo 'Building....'
	sh 'gradle --version'
	echo 'sh ./gradlew build'
	}	
    stage('Test') {
	echo 'Testing New Feature'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
}
