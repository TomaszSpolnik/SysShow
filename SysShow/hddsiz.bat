@echo off
wmic diskdrive get size > hddsiz.txt
exit /B