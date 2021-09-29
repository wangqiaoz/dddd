package com.github.wangqiaozhang.dddd.services

import com.intellij.openapi.project.Project
import com.github.wangqiaozhang.dddd.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
