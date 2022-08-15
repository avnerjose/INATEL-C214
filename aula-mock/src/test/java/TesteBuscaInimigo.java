import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteBuscaInimigo {
    @Test
    public void testeBuscaInimigoSkeleton() {
        InimigoService service = new MockInimigoService();
        BuscaInimigo buscaInimigo = new BuscaInimigo(service);

        Inimigo inimigo = buscaInimigo.buscaInimigo(10);

        assertEquals("Skeleton", inimigo.getNome());
        assertEquals(200.0, inimigo.getQtdVida(), 0.1);
        assertEquals("Espada do Skeleton", inimigo.getArma());
    }

    @Test
    public void testeBuscaInimigoDefault() {
        InimigoService service = new MockInimigoService();
        BuscaInimigo buscaInimigo = new BuscaInimigo(service);

        Inimigo inimigo = buscaInimigo.buscaInimigo(20);

        assertEquals("Aranha", inimigo.getNome());
        assertEquals(100.0, inimigo.getQtdVida(), 0.1);
        assertEquals("Teia", inimigo.getArma());
    }
}
