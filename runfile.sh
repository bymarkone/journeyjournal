#!/bin/bash

echo "Running"

rm twdsl.js
rm data.js
curl -X POST -H Content-Type:text/plain --data-binary @source.jj localhost:8080/api/jarvis/editor >> twdsl.jj
curl -X POST -H Content-Type:text/plain --data-binary @twdsl.jj localhost:8080/api/twdsl/editor

echo "data = {" >> data.js

echo $'capability: ' >> data.js && curl -X GET localhost:8080/api/jj/capability >> data.js
echo $',\nfeedback: ' >> data.js && curl -X GET localhost:8080/api/jj/feedback >> data.js
echo $',\nfact: ' >> data.js && curl -X GET localhost:8080/api/jj/fact >> data.js

echo $'\n}' >> data.js

