# This is general Dockerfile to run standalone PHP Script
# i.e setup post back URL etc. 
# Please update COPY & WORKDIR accordinly 

FROM php:latest
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN apt-get update && apt-get install -y libpq-dev
RUN docker-php-ext-install pdo pdo_pgsql
# Expose the port your app runs on
EXPOSE 9090

# Start the PHP built-in server
CMD [ "php", "-S", "0.0.0.0:9090", "./index.php" ]