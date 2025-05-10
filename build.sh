#!/usr/bin/env bash

cd td/example/android/
./check-environment.sh
./fetch-sdk.sh
./build-openssl.sh
./build-tdlib.sh