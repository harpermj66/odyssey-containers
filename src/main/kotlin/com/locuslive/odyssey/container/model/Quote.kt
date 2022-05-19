package com.locuslive.odyssey.container.model

import io.quarkus.runtime.annotations.RegisterForReflection

@RegisterForReflection
class Quote() {

    var id: String = ""
    var price: Int = 0

    constructor(id: String, price: Int): this() {
        this.id = id
        this.price = price
    }

    override fun toString(): String {
        return "Quote{$id=$id price=$price}"
    }
}