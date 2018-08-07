@echo off
wmic memorychip get manufacturer > ramman.txt
exit /B