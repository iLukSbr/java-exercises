import java.util.List;

public interface Actor
{
    /**
    * Executa o comportamento regular do ator.
    * @param newActors Uma lista para armazenar os
    * atores criados recentemente.
    */
    void act(List<Actor> newActors);

    /**
    * O ator ainda est� ativo?
    * @return true se ainda ativo, false, caso contr�rio.
    */
    boolean isActive();
}