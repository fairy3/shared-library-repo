package org

import hudson.model.User

class UserUtils {
    static String getBuildUserFullName(script) {
        def cause = script.currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause)
        if (cause) {
            def userId = cause.userId
            def user = User.get(userId)
            return user?.getFullName()
        }
        return null
    }
}
