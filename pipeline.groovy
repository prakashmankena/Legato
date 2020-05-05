pipeline 
agent any 
stages("update"){
stage{

sh apt-get update 
}
}

