FROM ubuntu

#SUDO
RUN apt-get update && \
    apt-get -y install sudo

#RUN useradd -m docker && echo "docker:docker" | chpasswd && adduser docker sudo

#USER docker

#Pyparrot requirements
RUN apt-get update && \
	sudo apt-get install -y python3 && \
	apt-get install -y python3-pip && \
	apt-get install -y libglib2.0-dev && \
	pip3 install bluepy && \
	pip3 install untangle && \
	pip3 install zeroconf && \
	apt-get install -y bluetooth && \
	apt-get install -y bluez && \
	apt-get install -y python-bluez && \
	pip3 install pyparrot;

#JAVA
RUN apt-get update && \
	apt-get install -y git && \
	apt-get install -y ant && \
	apt-get install -y wget && \
	apt-get install -y software-properties-common && \
	sudo add-apt-repository ppa:openjdk-r/ppa && \
	apt-get clean;

# Fix certificate issues
RUN apt-get update && \
	apt-get install -y openjdk-8-jdk && \
	apt-get install ca-certificates-java && \
	apt-get clean && \
	update-ca-certificates -f;

RUN apt-get update && \
    sudo apt install -y vim

# Setup JAVA_HOME -- useful for docker commandline
ENV JAVA_HOME /usr/lib/jvm/java-1.8.0-openjdk-amd64
RUN export JAVA_HOME

COPY tomcat_install_script.sh /tomcat-install-script.sh
RUN ["chmod", "+x", "tomcat-install-script.sh"]
RUN /tomcat-install-script.sh

WORKDIR /xdrone

COPY xdrone-deploy.sh /xdrone/xdrone-deploy.sh
RUN ["chmod", "+x", "xdrone-deploy.sh"]

COPY test_drone.py /test_drone.py

WORKDIR /opt/tomcat/8_0/webapps
RUN ["rm", "-rf", "ROOT.war"]
RUN ["rm", "-rf", "ROOT"]
COPY ROOT.war /opt/tomcat/8_0/webapps/ROOT.war

WORKDIR /

EXPOSE 8080

#ENTRYPOINT ["/usr/bin/init"]
#CMD ["systemctl"]
