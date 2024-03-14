import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FechaTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun valida() {
        val fecha = Fecha(15, 12, 2023)
        assertTrue (fecha.valida())
    }

    @Test
    fun fechaInvalidaDia() {
        val fecha = Fecha(32, 5, 2022)
        assertFalse (fecha.valida())
    }

    @Test
    fun fechaInvalidaMes() {
        val fecha = Fecha(12, 13, 2021)
        // Assert.assertFalse(fecha.valida())
        assertFalse (fecha.valida())
    }

    @Test
    fun fechaInvalidaFebreroBisiesto() {
        val fecha = Fecha(29, 2, 2021)
        assertFalse (fecha.valida())
        println("Fecha invalida")
        println(fecha.valida())
    }

    @Test
    fun fechaValidaFebreroBisiesto() {
        val fecha = Fecha(29, 2, 2024)
        assertTrue (fecha.valida())
        println("Fecha valida Bisiesto")
        println(fecha.valida())
    }
}