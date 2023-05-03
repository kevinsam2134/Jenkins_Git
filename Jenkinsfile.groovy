pipeline {
    agent any
    environment{
        DIRECTORY_PATH ="C:/Users/HP/OneDrive/Desktop/SIT223_SIT753 - Professional Practice in Information Technology/J"
        TESTING_ENVIRONMENT ="Local Testing"
        PRODUCTION_ENVIRONMENT = "Kevin Samarasekera"
        
    }
    stages {
        stage("Build") {
            steps {
                echo "This is the Building Stage"
                echo "Fetch the code from the directory path: $DIRECTORY_PATH"
                echo "Compile the code  and generate any necessary artifacts"
            }
        }
        stage("Test") {
            steps {
                echo "This is the Testing Stage"
                echo "unit tests"
                echo "integration tests"
            }
        }
        stage("Code Quality Check") {
            steps {
                echo "This is the Code Quality Check Stage"
                echo "Check the quality of the code"
                
            }
        }
        stage("Deploy") {
            steps {
                echo "This is the Deploy Stage"
                echo "Deploy the application to a testing environment: $TESTING_ENVIRONMENT"
            }
        }
        stage("Approval") {
            steps {
                echo "This is the Approval Stage"
                sleep 10
            }
        }
        stage("Deploy to Production") {
        steps {
            echo "This is the Deploy to Production Stage"
            echo "Deploy the code to the Production environment: $PRODUCTION_ENVIRONMENT"
        }
    }
}
}