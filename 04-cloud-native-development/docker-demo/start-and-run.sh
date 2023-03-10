#!/usr/bin/env bash

docker build -t synchrony-demo .
docker run -it --rm -p 8000:80 synchrony-demo

# docker run -it --rm -p 8000:8080 agarwalconsulting/spring-greeting:java
