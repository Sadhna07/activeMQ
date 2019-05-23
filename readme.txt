#Edit /usr/local/Cellar/activemq/5.15.9/libexec/conf/activemq.xml to delay the messages as well as to make data persistence.

    <broker xmlns="http://activemq.apache.org/schema/core" brokerName="localhost" dataDirectory="${activemq.data}" schedulerSupport="true" persistent="true">
 

