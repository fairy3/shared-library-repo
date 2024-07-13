package org

class UserUtils {
    static String getBuildUserName(script) {
       def userName = script.env.BUILD_USER
       return userName ?: 'unknown user'
    }
}
