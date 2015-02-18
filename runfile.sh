#!/bin/bash

echo "Running"

rm natalia2.jj
rm data.js
curl -X POST -H Content-Type:text/plain --data-binary @natalia.jj localhost:8080/api/jarvis/editor >> natalia2.jj
curl -X POST -H Content-Type:text/plain --data-binary @natalia2.jj localhost:8080/api/twdsl/editor

echo "data = {" >> data.js

echo $'capability: ' >> data.js && curl -X GET localhost:8080/api/jj/capability >> data.js
echo $',\nfeedback: ' >> data.js && curl -X GET localhost:8080/api/jj/feedback >> data.js
echo $',\nfact: ' >> data.js && curl -X GET localhost:8080/api/jj/fact >> data.js

echo $'\n}' >> data.js

