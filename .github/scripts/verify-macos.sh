#!/usr/bin/env bash

task="$1"

status=0
log_file="${RUNNER_TEMP}/${task}.log"

./gradlew ":example:verification:app:macos:${task}" > "$log_file" 2>&1 || status="$?"

cat "$log_file"

if grep -q "\[TDL\] Success" "$log_file"; then
  exit 0
fi

exit "$status"
