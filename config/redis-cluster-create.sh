# wait for the docker-compose depends_on to spin up the redis nodes usually takes this long
sleep 10

node_0_ip=$(getent hosts redis-node-one | awk '{ print $1 }')
node_1_ip=$(getent hosts redis-node-two | awk '{ print $1 }')
node_2_ip=$(getent hosts redis-node-three | awk '{ print $1 }')
node_3_ip=$(getent hosts redis-node-four | awk '{ print $1 }')
node_4_ip=$(getent hosts redis-node-five | awk '{ print $1 }')
node_5_ip=$(getent hosts redis-node-six | awk '{ print $1 }')

redis-cli --cluster create $node_0_ip:6379 $node_1_ip:6379 $node_2_ip:6379 $node_3_ip:6379 $node_4_ip:6379 $node_5_ip:6379 --cluster-replicas 1 --cluster-yes
