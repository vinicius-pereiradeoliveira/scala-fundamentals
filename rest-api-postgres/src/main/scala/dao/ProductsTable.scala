package dao

import model.Product

class ProductsTabletag: Tag) extends Table[Product](tag, "products") {
  def id = column[Long]("id", O.PrimaryKey)
  def label = column[String]("label")
  def price = column[Double]("price")

  def * = (id, label, price) <> (Product.tupled, Product.unapply)

}
