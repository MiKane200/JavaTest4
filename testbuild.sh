i=1;
for f in $( ls|grep Exam* )
do
    if [ -d "$f" ];then
        cd "$f";
        mvn clean package;
        echo 第$i题结果：;
        docker-compose build;
        docker-compose up --exit-code-from java-1;
        sh stop.sh;
        echo "attention !!! This program was over,see the results on the top";
        cd ..;
        let i++;
        read next;
    fi
done