#!/bin/bash

# 请注意
# 本脚本的作用是把本项目编译的结果保存到deploy文件夹中
# 1. 把项目数据库文件拷贝到deploy/db
# 2. 编译aiqc-admin
# 3. 编译aiqc-all模块，然后拷贝到deploy/aiqc

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"
cd $DIR/../..
aiqc_HOME=$PWD
echo "aiqc_HOME $aiqc_HOME"

# 复制数据库
cat $aiqc_HOME/aiqc-db/sql/aiqc_schema.sql > $aiqc_HOME/deploy/db/aiqc.sql
cat $aiqc_HOME/aiqc-db/sql/aiqc_table.sql >> $aiqc_HOME/deploy/db/aiqc.sql
cat $aiqc_HOME/aiqc-db/sql/aiqc_data.sql >> $aiqc_HOME/deploy/db/aiqc.sql

cd $aiqc_HOME/aiqc-admin
# 安装阿里node镜像工具
npm install -g cnpm --registry=https://registry.npm.taobao.org
# 安装node项目依赖环境
cnpm install
cnpm run build:dep

cd $aiqc_HOME
mvn clean package
cp -f $aiqc_HOME/aiqc-all/target/aiqc-all-*-exec.jar $aiqc_HOME/deploy/aiqc/aiqc.jar