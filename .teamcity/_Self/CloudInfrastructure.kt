package _Self

import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.RelativeId
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.s3Storage

object CloudInfrastructure : Project({

    features {
        s3Storage {
            id = "tc-cloud-PROJECT_EXT_100"

            bucketPrefix = "artifacts/superb-leakey-fq7j9p"
            bucketName = "common-teamcityhosteddev"
        }
    }
})
