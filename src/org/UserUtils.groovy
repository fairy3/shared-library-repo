package org

import hudson.model.User

class UserUtils {
    static String getBuildUserName(script) {
        static String getBuildUserName(script) {
        def userName = script.env.BUILD_USER_ID
        return userName ?: 'unknown user'
    }
}
