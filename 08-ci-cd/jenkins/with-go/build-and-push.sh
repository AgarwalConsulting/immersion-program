#!/usr/bin/env bash

docker build -t jenkins-with-go .
docker tag jenkins-with-go agarwalconsulting/jenkins-with-go
docker push agarwalconsulting/jenkins-with-go
