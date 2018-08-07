echo "wait mysql to be installed"
sleep 20;
echo "${MYSQL_IP}:${MYSQL_PORT}"
java -Dfile.encoding=UTF-8 -jar /Exam1.jar;
