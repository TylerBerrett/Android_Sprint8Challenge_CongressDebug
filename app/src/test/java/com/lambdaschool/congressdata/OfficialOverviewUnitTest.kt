package com.lambdaschool.congressdata

import org.junit.Test
import kotlin.test.assertEquals

class OfficialOverviewUnitTest {

    //private val overview = mock(OfficialOverview::class.java)

    @Test
    fun testConstructor(){
        val firstName = "B."
        val middleName = "Tyler"
        val lastName = "Berrett"
        val party = "yes i do"
        val state = "UT"
        val id = "12"

        val overviewTest = OfficialOverview(firstName, middleName, lastName, party, state, id)

        assertEquals("12", overviewTest.id)
        assertEquals("yes i do",overviewTest.party)
        assertEquals("UT", overviewTest.state)
        assertEquals("B. Tyler Berrett", overviewTest.displayName)


    }

}