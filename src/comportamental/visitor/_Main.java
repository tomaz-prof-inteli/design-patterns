package comportamental.visitor;

public class _Main {

	public static void main(String[] args) {
		 var htmldocument = new HtmlDocument();
		 htmldocument.add(new HeadingNode());
	     htmldocument.add(new AnchorNode());
	     htmldocument.execute(new PlainTextOperation());
	}

}
