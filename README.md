# ScalaRedis

### Starting the local Redis cluster

```bash
docker-compose up -d
```

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
- [How to spin up a redis cluster in Docker](https://www.merge.dev/blog/how-to-spin-up-redis-cluster-in-docker)
- [Basic Redis CLI commands](https://redis.io/docs/connect/cli/)
