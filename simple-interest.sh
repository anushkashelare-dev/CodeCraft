#!/usr/bin/env bash
set -euo pipefail

echo "Simple Interest Calculator"
read -r -p "Enter principal amount: " principal
read -r -p "Enter annual interest rate (%): " rate
read -r -p "Enter time (years): " time

if ! awk -v p="$principal" -v r="$rate" -v t="$time" 'BEGIN {
  if (p !~ /^[0-9]+([.][0-9]+)?$/ ||
      r !~ /^[0-9]+([.][0-9]+)?$/ ||
      t !~ /^[0-9]+([.][0-9]+)?$/) exit 1
}'; then
  echo "Please enter valid non-negative numbers."
  exit 1
fi

awk -v p="$principal" -v r="$rate" -v t="$time" 'BEGIN {
  si = (p * r * t) / 100
  total = p + si
  printf "Simple Interest: %.2f\n", si
  printf "Total Amount: %.2f\n", total
}'
