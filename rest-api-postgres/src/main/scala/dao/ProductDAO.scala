package dao

import slick.jdbc.JdbcBackend.Database
import slick.lifted.TableQuery

import scala.concurrent.Future

class ProductDAO(db: Database) {
  val products = TableQuery[ProductsTable]

  def getAllProducts: Future[Seq[Product]] = db.run(products.result)

  def getProductById(id: Long): Future[Option[Product]] =
    db.run(products.filter(_.id === id).result.headOption)

  def createProduct(product: Product): Future[Int] =
    db.run(products += product)

  def updateProduct(product: Product): Future[Int] =
    db.run(products.filter(_.id === product.id).update(product))

  def deleteProduct(id: Long): Future[Int] =
    db.run(products.filter(_.id === id).delete)
}
