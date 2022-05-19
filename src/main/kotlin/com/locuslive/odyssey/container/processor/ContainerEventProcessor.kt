package com.locuslive.odyssey.container.processor

import com.locuslive.odyssey.container.model.Quote
import io.smallrye.mutiny.Uni
import org.eclipse.microprofile.reactive.messaging.Incoming
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class ContainerEventProcessor {

    private val random = Random()

    @Incoming("container-events")
    fun process(quoteRequest: String): Uni<Quote> {
        println(quoteRequest)
        return Uni.createFrom().item(Quote(quoteRequest, random.nextInt()))
    }
}