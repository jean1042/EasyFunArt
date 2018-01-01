package com.jy.efun_splash

/**
 * Created by jean1 on 2018-01-01.
 */

/*성별, 연령대 관련 서버에게 보내는 것*/
data class Sendpost (
        var sex : String,
        var age : String,
        var genres: String,
        var place: String,
        var mood: String,
        var title: String
)