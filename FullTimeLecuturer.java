public class FullTimeLecuturer extends LecturerDecorator {

	private char Course;

	private char Lecturer;

	public FullTimeLecuturer(Lecturer l)
	{
		super(l);
	}

	public void Useprevioustemplate() {
		System.out.println("Use previous template for Fulltime Lecturer");

	}

	@Override
	public void CreateSyllabus() {
		System.out.println("CreateSyllabus for Fulltime Lecturer");

	}

}
