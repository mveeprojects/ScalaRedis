import redis.clients.jedis.{HostAndPort, JedisCluster}

class RedisClient(cluster: JedisCluster) {

  def storeAPerson(person: Person): Long = {
    cluster.msetnx(person.name, person.age.toString)
  }

  def getAPersonByName(name: String): String = {
    cluster.get(s"person:$name")
  }
}

object RedisClient {
  private val host  = "localhost"
  private val ports = List(6379, 6380, 6381, 6382, 6383, 6384)

  private val hostAndPorts: java.util.Set[HostAndPort] = new java.util.HashSet[HostAndPort]()
  ports.map(new HostAndPort(host, _)).foreach(hostAndPorts.add)

  private val cluster = new JedisCluster(hostAndPorts)

  def apply(): RedisClient =
    new RedisClient(cluster)
}
