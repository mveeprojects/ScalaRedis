import redis.clients.jedis.Jedis

class RedisClient(cluster: Jedis) {

  def storeAPerson(person: Person): String = {
    cluster.set(person.name, person.age.toString)
  }

  def getAPersonByName(name: String): String = {
    cluster.get(name)
  }
}

object RedisClient {

  private val jedis = new Jedis()

  def apply(): RedisClient =
    new RedisClient(jedis)
}
