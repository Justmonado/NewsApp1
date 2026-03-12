package com.pajasoft.newsapp.models

data class Noticia(
    val title: String,
    val fecha: String,
    val img : String
)

val newsList = listOf(
    Noticia(
        title = "El presidente de EE.UU. no muestra sifnos de arrepentimiento.",
        fecha = "febrero 08 - 2024",
        img = "https://ichef.bbci.co.uk/news/1024/branded_news/c5d7/live/9f0195a0-d517-11ef-94cb-5f844ceb9e30.jpg"
    ),
    Noticia(
        title = "Bañarse en la pscina del desierto de Cleopatra",
        fecha = "febrero 11 - 2024",
        img = "https://s1.elespanol.com/2018/09/21/cultura/historia/curiosidades_de_la_historia-historia-historia_339728816_98134230_1706x1280.jpg"
    ),
    Noticia(
        title = "Gigantes tecnológicos",
        fecha = "febrero 12 - 24",
        img  = "https://www.gaceta.unam.mx/wp-content/uploads/2023/04/230424-aca4-des-f1-gigantes-tecnologicos-internet.jpg"
    ),
    Noticia(
        title = "El rover de Marte envia nuevas imágenes",
        fecha = "febrero 14 - 2024",
        img = "https://unamglobal.unam.mx/wp-content/uploads/2018/02/91FA91A5-4FEF-44E7-9AAF-5AC51E577B0C.jpeg"
    )
)