public class AdjunctLecturer extends LecturerDecorator {

	private char Course;

	private char Lecturer;

	public AdjunctLecturer(Lecturer l)
	{
		super(l);
	}

	public void Modifysyllabus() {
		System.out.println("Modify syllabus for Adjunct Lecturer");

	}

	@Override
	public void CreateSyllabus() {
		System.out.println("Create syllabus for Adjunct Lecturer");
	}

}
