package com.mshdabiola.model

actual val generalPath: String
    get() = System.getProperty("java.io.tmpdir") + "/wikipedia-commons" // "${System.getProperty("user.home")}/AppData/Local/wikipedia-common"
