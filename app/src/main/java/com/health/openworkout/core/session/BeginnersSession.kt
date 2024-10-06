package com.health.openworkout.core.session

import com.health.openworkout.core.datatypes.WorkoutItem
import com.health.openworkout.core.datatypes.WorkoutSession
import com.health.openworkout.core.workout.AbdominalCrunch
import com.health.openworkout.core.workout.HighKnees
import com.health.openworkout.core.workout.JumpingJack
import com.health.openworkout.core.workout.Lunge
import com.health.openworkout.core.workout.Plank
import com.health.openworkout.core.workout.PushUpRotation
import com.health.openworkout.core.workout.PushUps
import com.health.openworkout.core.workout.Squat
import com.health.openworkout.core.workout.StepUp
import com.health.openworkout.core.workout.TricepsDip

class BeginnersSession(dayNr: Int, private val stressFac: Float) : WorkoutSession() {
    init {
        when (dayNr) {
            0 -> {
                addWorkoutTime(JumpingJack(), 15)
                addWorkoutRep(StepUp(), 5)
                addWorkoutRep(PushUps(), 2)
                addWorkoutRep(AbdominalCrunch(), 5)
                addWorkoutTime(Plank(), 5)
            }
            1 -> {
                addWorkoutTime(JumpingJack(), 15)
                addWorkoutRep(StepUp(), 10)
                addWorkoutRep(PushUps(), 3)
                addWorkoutRep(AbdominalCrunch(), 10)
                addWorkoutTime(Plank(), 10)
            }
            2 -> {
                addWorkoutTime(JumpingJack(), 18)
                addWorkoutRep(TricepsDip(), 4)
                addWorkoutRep(Squat(), 10)
                addWorkoutRep(AbdominalCrunch(), 10)
                addWorkoutTime(Plank(), 15)
            }
            3 -> {
                addWorkoutTime(JumpingJack(), 22)
                addWorkoutTime(HighKnees(), 10)
                addWorkoutRep(Lunge(), 12)
                addWorkoutRep(PushUpRotation(), 4)
                addWorkoutTime(Plank(), 15)
            }
            4 -> {
                addWorkoutTime(JumpingJack(), 25)
                addWorkoutRep(PushUps(), 4)
                addWorkoutRep(AbdominalCrunch(), 12)
                addWorkoutRep(Squat(), 12)
                addWorkoutTime(Plank(), 18)
            }
            5 -> {
                addWorkoutRep(PushUps(), 4)
                addWorkoutRep(AbdominalCrunch(), 15)
                addWorkoutRep(Squat(), 15)
                addWorkoutTime(HighKnees(), 15)
                addWorkoutTime(Plank(), 20)
            }
            6 -> {
                addWorkoutTime(JumpingJack(), 30)
                addWorkoutRep(TricepsDip(), 5)
                addWorkoutRep(Lunge(), 16)
                addWorkoutRep(AbdominalCrunch(), 16)
                addWorkoutTime(Plank(), 22)
            }
            7 -> {
                addWorkoutTime(JumpingJack(), 35)
                addWorkoutRep(StepUp(), 16)
                addWorkoutTime(HighKnees(), 15)
                addWorkoutRep(PushUpRotation(), 6)
                addWorkoutTime(Plank(), 25)
            }
        }
    }

    private fun addWorkoutTime(workoutItem: WorkoutItem, time: Int) {
        workoutItem.workoutTime = Math.round(time * stressFac)
        addWorkout(workoutItem)
    }

    private fun addWorkoutRep(workoutItem: WorkoutItem, rep: Int) {
        workoutItem.isTimeMode = false
        workoutItem.repetitionCount = Math.round(rep * stressFac)
        addWorkout(workoutItem)
    }
}
