#!/usr/bin/env bash

set -eu

timeout_seconds=60
elapsed_seconds=0
result=""

while [ "$elapsed_seconds" -lt "$timeout_seconds" ]; do
  if adb logcat -d 2>/dev/null | grep -q "\[TDL\] Success"; then
    result="SUCCESS"
    break
  fi

  if adb logcat -d 2>/dev/null | grep -q "\[TDL\] Failure"; then
    result="FAILURE"
    break
  fi

  sleep 2
  elapsed_seconds=$((elapsed_seconds + 2))
done

echo "--- TDL log output ---"
adb logcat -d | grep "\[TDL\]" || echo "(no [TDL] entries)"

if [ "$result" = "SUCCESS" ]; then
  exit 0
fi

if [ "$result" = "FAILURE" ]; then
  exit 1
fi

echo "Timed out after ${timeout_seconds}s"
exit 1
