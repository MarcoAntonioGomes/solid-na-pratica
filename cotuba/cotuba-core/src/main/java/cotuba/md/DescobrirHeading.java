package cotuba.md;


import cotuba.domain.builder.CapituloBuilder;
import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.Heading;
import org.commonmark.node.Text;

public class DescobrirHeading extends AbstractVisitor {

    private CapituloBuilder capituloBuilder;

    public DescobrirHeading(CapituloBuilder capituloBuilder) {
        this.capituloBuilder = capituloBuilder;
    }

    @Override
    public void visit(Heading heading) {
        if (heading.getLevel() == 1) {
            // capítulo
            String tituloDoCapitulo = ((Text) heading.getFirstChild()).getLiteral();
            capituloBuilder.comTitulo(tituloDoCapitulo);
        } else if (heading.getLevel() == 2) {
            // seção
        } else if (heading.getLevel() == 3) {
            // título
        }
    }
}
