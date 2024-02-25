case class Person(name: String, age: Int)

object Main extends App {

  val redis = RedisClient()

  val people = List(
    Person("Mark", 36),
    Person("Sally", 41)
  )

  println("\n--- Storing people in Redis ---")
  people.foreach { p =>
    println(s"Storing ${p.name}")
    println(redis.storeAPerson(p))
  }

  println("\n--- Retrieving people from Redis ---")
  people.foreach { p =>
    println(s"Retrieving ${p.name}")
    val person: String = redis.getAPersonByName(p.name)
    println(s"This is ${p.name} from Redis: $person")
  }
}
