Prestiti 	
KAFKA	
ELASTICSEARCH	
LOGSTASH	
FILEBEAT	
KIBANA	


→ deployare infrastruttura KAFKA
Creare il file kafka-values.yaml all’interno del progetto
digitare il comando 
helm install --values kafka-values.yaml kafka bitnami/kafka

verificare che KAFKA sia installato correttamente, digitare il comando:
kubectl get pods

→ deployare l’infrastruttura su ELASTICSEARCH
aggiungere il repository elastic Helm
helm repo add elastic https://helm.elastic.co
installare Elasticsearch (prima creare il file elasticsearch-values.yaml secondo le indicazioni del docente)
helm install --values elasticsearch-values.yaml elasticsearch elastic/elasticsearch

controllare se funziona tutto correttamente
kubectl get pods --namespace=default -l app=elasticsearch-master

installare Logstash (creare il file logstash-values.yaml)
helm install --values logstash-values.yaml logstash elastic/logstash


controllare se funziona correttamente
kubectl get pods --namespace=default -l app=logstash-logstash

installa Filebeat come DaemonSet (prima creare il file filebeat-values.yaml)
helm install --values filebeat-values.yaml filebeat elastic/filebeat


controllare se funziona tutto correttamente
kubectl get pods --namespace=default -l app=filebeat

installare KIBANA (prima creare il file kibana-values.yaml)
helm install --values kibana-values.yaml kibana elastic/kibana


controllare che tutto funzioni correttamente
kubectl get pods --namespace=default -l app=kibana
