#!/bin/bash

# 本脚本的作用是停止当前Spring Boot应用，然后再次部署
sudo service aiqc stop
sudo ln -f -s /home/ubuntu/deploy/aiqc/aiqc.jar /etc/init.d/aiqc
sudo update-rc.d aiqc defaults
sudo update-rc.d aiqc enable
sudo service aiqc start