#!/bin/bash

FILE_NAME=$1
LINE_NUMBER=$2
LINE_FROM=$3
LINE_TO=$4

sed -n "${LINE_NUMBER}p" "$FILE_NAME" | grep -qx "$LINE_FROM" || (echo "Line $LINE_NUMBER mismatch" && exit 1)
sed -i '.bak' "${LINE_NUMBER}s|.*|$LINE_TO|" "$FILE_NAME"
