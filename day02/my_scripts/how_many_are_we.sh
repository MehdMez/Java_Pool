#!/bin/bash
#how_many_are_we.sh

grep -oi "$1" | wc -l
