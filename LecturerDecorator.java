public class LecturerDecorator implements Lecturer {

	
	private char Course;

	private char Lecturer;

	protected Lecturer lec;

	public LecturerDecorator(Lecturer l)
	{
		this.lec = l;
	}

	@Override
	public void CreateSyllabus() {
		this.lec.CreateSyllabus();

	}

}
