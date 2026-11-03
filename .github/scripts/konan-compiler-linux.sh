#!/usr/bin/env bash

set -euo pipefail

: "${KONAN_LLVM_HOME:?KONAN_LLVM_HOME is required}"
: "${KONAN_TOOLCHAIN:?KONAN_TOOLCHAIN is required}"
: "${KONAN_TARGET_TRIPLE:?KONAN_TARGET_TRIPLE is required}"

compiler="${1:?Compiler name is required (clang or clang++)}"
shift

exec "$KONAN_LLVM_HOME/bin/$compiler" \
  -B"$KONAN_LLVM_HOME/bin" \
  -fno-stack-protector \
  "--gcc-toolchain=$KONAN_TOOLCHAIN" \
  -target "$KONAN_TARGET_TRIPLE" \
  "--sysroot=$KONAN_TOOLCHAIN/$KONAN_TARGET_TRIPLE/sysroot" \
  -fuse-ld=lld \
  -fPIC \
  "$@"
