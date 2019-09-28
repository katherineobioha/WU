#!/bin/bash
if [ -e "/myFiles/file5" -a -e "/myFiles/file6" -a -e "/myFiles/file7" ]; 
then
    echo "all exist"
else
    echo "one or more is missing"
fi