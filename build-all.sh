#!/bin/bash

SERVICES=("config-server" "discovery-service" "api-gateway" "flight-service")

echo "Starting build for all services..."

for SERVICE in "${SERVICES[@]}"
do
  echo "-------------------------------------"
  echo "Building $SERVICE..."
  echo "-------------------------------------"

  cd services/$SERVICE

  mvn clean package -DskipTests

  docker build -t $SERVICE:1.0 .

  cd ../../
done

echo "-------------------------------------"
echo "All services built successfully!"
echo "-------------------------------------"