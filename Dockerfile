FROM harbor.bft.local/adoptopenjdk/openjdk11:alpine-jre
COPY target/PsGrpcSimpleServerApplication.jar PsGrpcSimpleServerApplication.jar
EXPOSE 29319
EXPOSE 9105
EXPOSE 9130
CMD ["java", "-jar", "PsGrpcSimpleServerApplication.jar", "-Dcom.sun.management.jmxremote=true", "-Dcom.sun.management.jmxremote.port=9130", "-Dcom.sun.management.jmxremote.rmi.port=9130", "-Dcom.sun.management.jmxremote.local.port=9130", "-Dcom.sun.management.jmxremote.authenticate=false", "-Dcom.sun.management.jmxremote.ssl=false"]
