#!/usr/bin/env bash

docker run -itd -p 8080:8080 -p 50000:50000 jenkins/jenkins:lts
