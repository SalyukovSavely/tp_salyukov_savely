#!/bin/bash

if [ $# -ne 2 ]; then
    echo "Usage: $0 <input_directory> <output_directory>"
    exit 1
fi

input_dir="$1"
output_dir="$2"

find "$input_dir" -type f -print0 | while IFS= read -r -d '' file; do
    base_name=$(basename "$file")
    target_file="$output_dir/$base_name"
    counter=1
    while [ -e "$target_file" ]; do
        target_file="${output_dir}/${base_name%.*}_$counter.${base_name##*.}"
        let counter+=1
    done
    cp "$file" "$target_file"
done
