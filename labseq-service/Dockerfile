FROM openjdk:17.0.2-jdk

#ARG: defines a variable that can be passed at build time (--build-arg)
ARG PROJECT_NAME
ARG APP_VERSION

#ENV: sets the environment variable
ENV USER_NAME microservice
ENV APP_HOME /usr/local/backend/$USER_NAME
ENV PROJECT_NAME $PROJECT_NAME
ENV APP_NAME_VERSION $PROJECT_NAME-$APP_VERSION

COPY target/${APP_NAME_VERSION}.jar ${APP_HOME}/${APP_NAME_VERSION}.jar

EXPOSE 8080

WORKDIR $APP_HOME

ENTRYPOINT java -XX:MaxRAMPercentage=60.0 -jar ${APP_NAME_VERSION}.jar