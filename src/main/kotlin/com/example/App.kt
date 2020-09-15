package com.example

import pl.treksoft.kvision.Application
import pl.treksoft.kvision.form.text.typeahead
import pl.treksoft.kvision.panel.root
import pl.treksoft.kvision.startApplication

class App : Application() {
    override fun start() {
        root("kvapp") {
            typeahead(
                label = "Customers",
                source = { search, callback ->
                    callback(arrayOf(search, search + search, search + search + search))
                }
            )
        }
    }
}

fun main() {
    startApplication(::App)
}