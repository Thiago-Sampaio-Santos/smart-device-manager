package main.theme;

public class DecoradorTemaEscuro implements ComponenteDeTema {
    private ComponenteDeTema componente;

    public DecoradorTemaEscuro(ComponenteDeTema componente) {
        this.componente = componente;
    }



    @Override
    public void renderizar() {
        componente.renderizar();
        System.out.println("O modo escuro foi aplicado com sucesso!");
    }
    
}
