package com.vappfactory.carousel.viewtypemapper

import com.vappfactory.carousel.Item

internal object ViewTypeMapper {
    private val classToViewTypeMap = mutableMapOf<Class<out Item>, Int>()
    private val viewTypeToClassMap = mutableMapOf<Int, Class<out Item>>()
    private var autoIncrementId = 0

    fun getViewType(clazz: Class<out Item>): Int {
        val type = classToViewTypeMap[clazz]
        if (type == null) put(clazz)
        return classToViewTypeMap[clazz] ?: throw IllegalStateException()
    }

    private fun put(clazz: Class<out Item>) {
        classToViewTypeMap[clazz] = autoIncrementId
        viewTypeToClassMap[autoIncrementId] = clazz
        autoIncrementId++
    }

    fun getClassType(viewType: Int): Class<out Item> {
        return viewTypeToClassMap[viewType]
            ?: throw IllegalStateException("No class type found for the view type")
    }
}