sed -n "10p" file.txt

tail -n +10 file.txt | head -1

#文件行数获取
#awk '{print NR}' file.txt | tail -n1
#10
#awk 'END{print NR}' file.txt
#10
#grep -nc "" file.txt
#10
#grep -c "" file.txt
#10
#grep -vc "^$" file.txt
#10
#grep -n "" file.txt|awk -F: '{print '}|tail -n1 | cut -d: -f1
#10
#grep -nc "" file.txt
#10
#sed -n "$=" file.txt
#10
#wc -l file.txt
#10 file.txt
#cat file.txt | wc -l
#10
#wc -l file.txt | cut -d' ' -f1
#10
