node {
    stage('SCM') {
	echo 'Gathering code from version control'
	git branch: '${branch}', url: 'https://github.com/trussbtech/JenkinsGroovy.git'
    }
    stage('Build') {
	echo 'Building....'
	sh 'gradle --version'
	sh './gradlew build'
	}	
    stage('Test') {
	echo 'Testing New Feature'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
}
