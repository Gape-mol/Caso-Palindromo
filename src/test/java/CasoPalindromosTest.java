import org.junit.jupiter.api.Test;

class CasoPalindromosTest {
    @Test
    void esPalindromoTest1() {
        assert CasoPalindromos.esPalindromo("aca") == true;
    }

    @Test
    void esPalindromoTest2(){
        assert CasoPalindromos.esPalindromo("acas") == false;
    }

    @Test
    void esPalindromoTest3(){
        assert CasoPalindromos.esPalindromo("h") == true;
    }
}