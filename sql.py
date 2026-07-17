import mysql.connector
conn=mysql.connector.connect(host="localhost",user="root",password="Aruna@2006")
c=conn.cursor()
c.execute("show databases ")
for i in c:
    print(i)