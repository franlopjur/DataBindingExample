package com.betabeers.databindingexample.util

import android.databinding.ObservableArrayList
import com.betabeers.databindingexample.model.AndroidVersionModel

class ModelUtils {
    companion object {
        /**
         * Creamos el listado de versiones de forma estática, podríamos poner los textos en strings.xml
         */
        fun generateModel(): ObservableArrayList<AndroidVersionModel> {
            val androidVersionList = ObservableArrayList<AndroidVersionModel>()
            val androidDonut = AndroidVersionModel("1.6", "Donut",
                    "Donut puso la información del mundo en la palma de tu mano con el cuadro" +
                            " de búsqueda rápida. Además, se dieron los primeros pasos para poder utilizar" +
                            " Android en diferentes formas y tamaños mientras Android Market maduraba.",
                    "http://pm1.narvii.com/6420/d5f607445c719ccfcd896b8d3ae145089c24a1ef_00.jpg")
            val androidEclair = AndroidVersionModel("2.1", "Eclair",
                    "Con Eclair, las pantallas de alta densidad mostraron impresionantes fondos de pantalla animados que respondían al tocarlos. Además, podías llegar a cualquier sitio en coche con la navegación detallada y la información sobre el tráfico en tiempo real directamente en el teléfono..",
                    "http://2.bp.blogspot.com/-cMcJ2AiNVRE/UHhLJwjrwrI/AAAAAAAAABM/OiYfqKKK3LQ/s1600/2.0.png")
            val androidFroyo = AndroidVersionModel("2.2", "Froyo",
                    "Froyo dio a conocer teléfonos ultrarrápidos que se podían controlar por voz. Además, gracias a las zonas Wi-Fi, podías tener conexión a Internet en cualquier situación.",
                    "https://i2.bssl.es/softhoy/2010/05/froyo.png")
            val androidGingerbread = AndroidVersionModel("2.3", "Gingerbread",
                    "Gingerbread ofrecía una experiencia Android más sencilla y rápida tanto para los usuarios como para los desarrolladores. Los juegos alcanzaron un nuevo nivel, la duración de la batería era mayor y la compatibilidad con NFC dio lugar a una nueva categoría de aplicaciones.",
                    "https://vignette.wikia.nocookie.net/kirby--fanon/images/2/24/Android-gingerbread.jpg/revision/latest?cb=20140530184444&path-prefix=es")
            val androidHoneycomb = AndroidVersionModel("3.0", "Honeycomb",
                    "Honeycomb marcó el inicio de la era de los tablets con una interfaz sencilla que incluía imágenes grandes y navegación en pantalla fluida.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/45/Honeycomb.jpg")
            val androidIceCreamSandwich = AndroidVersionModel("4.0", "Ice Cream Sandwich",
                    "Ice Cream Sandwich subió la apuesta en materia de personalización y control de usuario. Esta versión te permite personalizar la pantalla de inicio, definir la cantidad de datos que quieres utilizar y compartir contenido al instante en cualquier momento.",
                    "https://fthmb.tqn.com/yfGVE-XcqxZb__Ufu1_rdvBK4lY=/768x0/filters:no_upscale()/Android-4.0-Ice-Cream-Sandwich-566cd26f3df78ce161861b53.jpg")
            val androidJellyBean = AndroidVersionModel("4.1", "Jelly Bean",
                    "En Jelly Bean, cada aspecto de la versión se impregnó de inteligencia y se marcó el inicio de la asistencia móvil personalizada con Google Now. Además, permitía interactuar aún más con las notificaciones y utilizar varias cuentas de usuario en un mismo dispositivo.",
                    "http://androcode.es/wp-content/uploads/2015/02/jbean_srgb_ncro0s.png")
            val androidKitKat = AndroidVersionModel("4.4", "KitKat",
                    "Android KitKat permite realizar acciones por voz. Solo tienes que decir \"Ok Google\" para iniciar una búsqueda por voz, enviar un mensaje de texto, obtener indicaciones o incluso reproducir una canción. Además, tu dispositivo te permite disfrutar de un nuevo diseño que destaca el contenido.",
                    "http://www.technobaboy.com/wp-content/uploads/Android-KitKat-Logo.jpg")
            val androidLollipop = AndroidVersionModel("5.0", "Lollipop",
                    "Android llega a las pantallas grandes y pequeñas, desde teléfonos y tablets hasta relojes, televisores y coches. Lollipop incorpora Material Design, que ofrece un diseño atractivo y una respuesta táctil fluida.",
                    "https://i.blogs.es/37d176/android-lollipop-1/450_1000.jpg")
            val androidMarshmallow = AndroidVersionModel("6.0", "Marshmallow",
                    "Tu dispositivo móvil se vuelve mucho más dulce: Google Now a un Toque te ofrece accesos directos sencillos y respuestas inteligentes, la batería dura mucho más tiempo y los nuevos permisos de las aplicaciones te permiten tener un mayor control de tu información.",
                    "https://i.blogs.es/fe1202/marshmallow/450_1000.jpg")
            val androidNougat = AndroidVersionModel("7.0", "Nougat",
                    "Tu dispositivo móvil se vuelve mucho más dulce: Google Now a un Toque te ofrece accesos directos sencillos y respuestas inteligentes, la batería dura mucho más tiempo y los nuevos permisos de las aplicaciones te permiten tener un mayor control de tu información.",
                    "https://i.blogs.es/66c6ef/nougat/450_1000.jpg")
            val androidOreo = AndroidVersionModel("8.0", "Oreo",
                    "Tu dispositivo móvil se vuelve mucho más dulce: Google Now a un Toque te ofrece accesos directos sencillos y respuestas inteligentes, la batería dura mucho más tiempo y los nuevos permisos de las aplicaciones te permiten tener un mayor control de tu información.",
                    "https://betanews.com/wp-content/uploads/2017/12/Android-8.1-Oreo-e1514899361872.png")
            androidVersionList.add(androidDonut)
            androidVersionList.add(androidEclair)
            androidVersionList.add(androidFroyo)
            androidVersionList.add(androidGingerbread)
            androidVersionList.add(androidHoneycomb)
            androidVersionList.add(androidIceCreamSandwich)
            androidVersionList.add(androidJellyBean)
            androidVersionList.add(androidKitKat)
            androidVersionList.add(androidLollipop)
            androidVersionList.add(androidMarshmallow)
            androidVersionList.add(androidNougat)
            androidVersionList.add(androidOreo)
            return androidVersionList
        }
    }
}