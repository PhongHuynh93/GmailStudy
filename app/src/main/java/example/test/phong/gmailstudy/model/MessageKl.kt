package example.test.phong.gmailstudy.model

/**
 * Created by user on 7/29/2017.
 * <a href="https://medium.com/@DarrenAtherton/intro-to-data-classes-in-kotlin-7f956d54365c"
 * info - When we specify the data keyword in our class definition, Kotlin automatically generates field accessors, hashCode(), equals(), toString(), as well as the useful copy() and componentN() functions (more on these later).
 */
data class MessageKl( val id: Int,
                      var from: String,
                      var subject: String,
                      var message: String,
                      var timestamp: String,
                      var picture: String,
                      var isImportant: Boolean,
                      var isRead: Boolean,
                      var color: Int
                     )