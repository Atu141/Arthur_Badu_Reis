package arvore;

public class ABBINT {

	private class ARVORE{
		int dado;
		ARVORE esq;
		ARVORE dir;
	}
	
	public ARVORE root = null;
	// insere elementos em uma ABB
	public ARVORE inserir(ARVORE p, int info) {
		if(p == null) {
			p = new ARVORE();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		}else if(info<p.dado)
			p.esq = inserir(p.esq, info);
		else
			p.dir = inserir(p.dir, info);
		return p;
	}
	
	public void show(ARVORE p) {
		if(p!=null) {
			show(p.esq);
			System.out.print("\t" + p.dado);
			show(p.dir);
		}
	}
}
