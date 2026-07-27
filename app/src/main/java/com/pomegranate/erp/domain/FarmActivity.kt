package com.pomegranate.erp.domain

import java.time.LocalDateTime

/**
 * Single entry for the farm's activity log.
 * This is the foundation for spray, irrigation, fertigation, disease, and expense tracking.
 */
data class FarmActivity(
    val id: Long = 0,
    val dateTime: LocalDateTime,
    val activityType: ActivityType,
    val title: String,
    val product: String? = null,
    val quantity: String? = null,
    val unit: String? = null,
    val costInInr: Double? = null,
    val plot: String? = null,
    val notes: String? = null,
    val operatorName: String? = null,
)

enum class ActivityType {
    IRRIGATION,
    FERTIGATION,
    SPRAY,
    DISEASE,
    PEST,
    NUTRITION,
    HARVEST,
    EXPENSE,
    TASK,
}
