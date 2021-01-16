#!/bin/sh

pkill -f gradle
pkill -f DroidBotApplication

cp /usr/local/etc/droid-wars.jks src/main/resources

mkdir -p deploy-logs
nohup gradle build --continuous > deploy-logs/continuous-build.out &
nohup gradle bootRun > deploy-logs/boot-run.out &
