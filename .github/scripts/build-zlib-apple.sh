#!/usr/bin/env bash

set -euo pipefail

source_directory="${1:?Source directory is required}"
build_directory="${2:?Build directory is required}"
sdk="${3:?Apple SDK is required}"
architecture="${4:?Architecture is required}"
deployment_target="${5:?Deployment target is required}"

cmake_args=(
  -DCMAKE_BUILD_TYPE=Release
  "-DCMAKE_OSX_SYSROOT=$sdk"
  "-DCMAKE_OSX_ARCHITECTURES=$architecture"
  "-DCMAKE_OSX_DEPLOYMENT_TARGET=$deployment_target"
  "-DCMAKE_INSTALL_PREFIX=$build_directory/install"
  -DZLIB_BUILD_EXAMPLES=OFF
)

case "$sdk" in
  macosx) ;;
  iphoneos|iphonesimulator)
    cmake_args+=(
      -DCMAKE_SYSTEM_NAME=iOS
    )
    ;;
  *)
    echo "::error::Unsupported Apple SDK: $sdk"
    exit 1
    ;;
esac

cmake -S "$source_directory" -B "$build_directory" "${cmake_args[@]}"
cmake --build "$build_directory" --target install --parallel
