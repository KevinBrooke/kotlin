package _Root

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Project

object Project : Project({
    uuid = "b83fcbb5-9136-465b-b3c1-208f5060d279"
    id("_Root")
    name = "<Root project>"
    description = "Contains all other projects"

    features {
        feature {
            id = "PROJECT_EXT_1"
            type = "ReportTab"
            param("startPage", "coverage.zip!index.html")
            param("title", "Code Coverage")
            param("type", "BuildReportTab")
        }
    }

    cleanup {
        preventDependencyCleanup = false
    }
})
