#!/bin/bash
FolderDirectory = "/myFiles"
nth = '7'
#[ ! -d $FolderDirectory ] && sudo mkdir -p $FolderDirectory
cd $FolderDirectory
eval touch file{1..nth}
for value in $(seq 1 $((nth-3)))
do
	sudo rm "file${value}"
done