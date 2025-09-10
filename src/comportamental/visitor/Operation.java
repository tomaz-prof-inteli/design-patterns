package comportamental.visitor;

// visitor
public interface Operation {
     void apply(HeadingNode heading);
     void apply(AnchorNode anchor);
}
