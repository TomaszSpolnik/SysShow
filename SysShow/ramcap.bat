@echo off
wmic memorychip get capacity > ramcap.txt
exit /B