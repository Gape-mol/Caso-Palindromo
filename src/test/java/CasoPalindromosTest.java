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

//    @Test
//    void esPalindromoTest4(){
//        assert CasoPalindromos.esPalindromo(200) == false;
//    }

    @Test
    void esPalindromoTest5(){
        assert CasoPalindromos.esPalindromo("") == true;
    }

    @Test
    void esPalindromoTest6(){
        assert CasoPalindromos.esPalindromo("aaabccbaaa") == true;
    }

    @Test
    void esPalindromoTest7(){
        assert CasoPalindromos.esPalindromo("La tele letal") == true;
    }
}