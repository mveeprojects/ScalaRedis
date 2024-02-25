# ScalaRedis

### Starting the local Redis cluster/container

```bash
docker-compose up -d
```

At present this fires up a single [redis-stack](https://redis.io/docs/install/install-stack/docker/?utm_source=redisinsight&utm_medium=main&utm_campaign=docker) node which includes RedisInsight (UI for Redis) accessible on port [8001](http://localhost:8001).

[//]: # ([WIP] docker-compose-redis-cluster.yml - still figuring out how to configure a 6-node Redis cluster from scratch. )

### Example Redis commands

Install redis-cli locally using `brew install redis`.

```bash
redis-cli
127.0.0.1:6379> SET item:3374 100
OK
127.0.0.1:6379> INCR item:3374
(integer) 101
127.0.0.1:6379> GET item:3374
"101"
127.0.0.1:6379> KEYS *item*
1) "item:3374"
127.0.0.1:6379> DEL item:3374
(integer) 1
127.0.0.1:6379> KEYS *item*
(empty array)
```

### Sources
- [Basic Redis CLI commands](https://redis.io/docs/connect/cli/)
- [Jedis (Java Redis client library)](https://github.com/redis/jedis)
- [Baeldung: Intro to Jedis](https://www.baeldung.com/jedis-java-redis-client-library)
- [Redis: Run Redis Stack on Docker](https://redis.io/docs/install/install-stack/docker/?utm_source=redisinsight&utm_medium=main&utm_campaign=docker)
- [Redis: RedisInsight](https://redis.io/docs/connect/insight/)

[WIP] Setting up a Redis cluster locally via docker-compose:
- [How to spin up a redis cluster in Docker](https://www.merge.dev/blog/how-to-spin-up-redis-cluster-in-docker)
  - [Also this from Medium](https://pierreabreu.medium.com/building-redis-cluster-with-docker-compose-9569ddb6414a)
  - [And this from Hashnode](https://ilhamdcp.hashnode.dev/creating-redis-cluster-with-docker-and-compose)
