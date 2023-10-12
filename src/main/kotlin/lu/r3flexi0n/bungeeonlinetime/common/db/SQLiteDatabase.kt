package lu.r3flexi0n.bungeeonlinetime.common.db

import java.io.File

class SQLiteDatabase(file: File) : Database("SQLite", arrayOf("org.sqlite.JDBC"), "jdbc:sqlite:" + file.path) {

    override fun createIndex() {
        con.createStatement().use { st ->
            st.executeUpdate("CREATE INDEX IF NOT EXISTS BungeeOnlineTimeIndex ON BungeeOnlineTime (name, time);")
        }
    }

    override val insertQuery = "INSERT OR IGNORE INTO BungeeOnlineTime VALUES (?, ?, ?);"
}