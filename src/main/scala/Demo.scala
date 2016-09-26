
object Demo extends App {

  Utill.createTable()
  Utill.insertRecord()
  print("\n============= All inserted Records ==================")
  Utill.retrieveRecord("students").show()
  print("\n============= Loaded Records ==================")
  Utill.loadData().show()

}
