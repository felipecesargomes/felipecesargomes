del /q "C:\Users\wwwfe\Downloads\*"
FOR /D %%p IN ("C:\Users\wwwfe\Downloads\*.*") DO rmdir "%%p" /s /q