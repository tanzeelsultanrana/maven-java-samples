
# Use an official Java runtime as a parent image
FROM openjdk:11-jre-slim-buster

# Set the working directory to /app
WORKDIR /app

# Copy the application jar file into the container
COPY target/myapp.jar /app/myapp.jar

# Install Logstash and ssmtp packages
RUN apt-get update && \
    apt-get install -y wget ssmtp && \
    wget -qO - https://artifacts.elastic.co/GPG-KEY-elasticsearch | apt-key add - && \
    echo "deb https://artifacts.elastic.co/packages/7.x/apt stable main" | tee -a /etc/apt/sources.list.d/elastic-7.x.list && \
    apt-get update && \
    apt-get install -y logstash

# Copy the Logstash configuration file into the container
COPY logstash.conf /etc/logstash/conf.d/logstash.conf

# Copy the ssmtp configuration file into the container
COPY ssmtp.conf /etc/ssmtp/ssmtp.conf

# Set the environment variable for Logstash
ENV LS_SETTINGS_DIR=/etc/logstash

# Expose the default Logstash port
EXPOSE 5044

# Run the application and Logstash
CMD java -jar myapp.jar 2>&1 | tee /app/error.log | logstash -f /etc/logstash/conf.d/logstash.conf && cat /app/error.log | mail -s "Java Application Exception" youremail@example.com