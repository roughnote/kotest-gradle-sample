package com.pradeep.kotlinsample

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SampleSpec : StringSpec() {
    init {
        "Simple addition test" {
            val result = 1 + 2

            result shouldBe  3
        }

        "Simple subtraction test" {
            val result = 1 - 2

            result shouldBe -1
        }
    }
}