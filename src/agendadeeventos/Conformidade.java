package agendadeeventos;

/**
 * Interface com validações necessárias para os eventos
 * @author Simon
 */
public interface Conformidade {
    public abstract void verificaAlvara();
    public abstract void realizarVistoria();
    public abstract void estabeleceAreaRestritas();
    public abstract void controlaNormasGerais();
}
