package io.study.mygradle.multi_module_basic1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultiModuleBasic1Application

fun main(args: Array<String>) {
	runApplication<MultiModuleBasic1Application>(*args)
}
