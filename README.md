##microservices-based-springboot

sudo mvn clean package -DskipTests ---build maven

docker build -t springboot-backend . ---- build backend image

docker build -t static-frontend . -----build frontend image

mysql -h -P -u -p

mysql -h mydb-instance.abcdefg1234.us-east-1.rds.amazonaws.com -P 3306 -u admin -p

docker network create my-network

docker run -d --network my-network -p 8081:8081 --name backend springboot-backend

docker run -d --network my-network -p 81:80 --name frontend static-frontend

url http://35.153.203.192:81/vendor.html
