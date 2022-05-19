package com.locuslive.odyssey.container.processor

import org.eclipse.microprofile.reactive.messaging.Incoming
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class ContainerEventProcessor {

    private val random = Random()

    @Incoming("container-events")
    fun process(quoteRequest: String) {
        println(quoteRequest)
    }
}