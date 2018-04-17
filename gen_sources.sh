#!/bin/bash

n=$1
#n=1
mkdir -p millTest/src/blah
charsPerLine=70
lines=100
line=""
for y in `seq 1 $charsPerLine`; do
    line="${line}x"
done
line="//$line\n"
echo $line
for x in `seq 1 $n`;
do
z="package foo\n\nobject Blah$x\n"
for y in `seq 1 $lines`; do
    z+="$line"
done
echo $x

printf "$z" > millTest/src/blah/Blah$x.scala

done
