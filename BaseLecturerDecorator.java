public class BaseLecturerDecorator implements Lecturer
{
    @Override
    public void CreateSyllabus()
    {
        System.out.println("Syllabus created");
    }
}