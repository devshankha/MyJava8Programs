
interface Visitable {
	void accept(ReflectiveVisitor v) throws Exception;

}


class Pen implements Visitable {
	@Override
	public void accept(ReflectiveVisitor v) throws Exception {
		v.visit(this);
		
	}
	
	
}

class Book implements Visitable {

	@Override
	public void accept(ReflectiveVisitor v) throws Exception {
		v.visit(this);
		
	}
	
}