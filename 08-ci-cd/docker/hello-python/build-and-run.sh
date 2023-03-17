#!/usr/bin/env bash

docker build -t hello-go .

docker run --rm hello-go
