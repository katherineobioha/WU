#!/bin/bash
FolderDirectory = "/Users/kathe/workspace/com.kobioha.wheelsup/myFiles"
nth = '7'
[ ! -d $FolderDirectory ] && mkdir -p $FolderDirectory
cd $FolderDirectory
eval touch file{1..nth}
for value in $(seq 1 $((nth-3)))
do
	sudo rm "file${value}"
done