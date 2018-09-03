import org.junit.Test
import org.junit.Ignore
import kotlin.test.assertEquals

class RnaTranscriptionTest {
    @Test
    fun cytosineComplementIsGuanine() {
        assertEquals("G", transcribeToRna("C"))
    }

    @Test
    fun guanineComplementIsCytosine() {
        assertEquals("C", transcribeToRna("G"))
    }

    @Test
    fun thymineComplementIsAdenine() {
        assertEquals("A", transcribeToRna("T"))
    }

    @Test
    fun adenineComplementIsUracil() {
        assertEquals("U", transcribeToRna("A"))
    }

    @Test
    fun rnaTranscription() {
        assertEquals("UGCACCAGAAUU", transcribeToRna("ACGTGGTCTTAA"))
    }

}
