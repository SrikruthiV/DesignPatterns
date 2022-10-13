public class decoratorPatternDemo
{
    public static void main(String[] args)
    {
        FullTimeLecuturer fullTimeLec = new FullTimeLecuturer(new BaseLecturerDecorator());
        fullTimeLec.Useprevioustemplate();
        fullTimeLec.CreateSyllabus();
        
        AdjunctLecturer adjLec = new AdjunctLecturer(new BaseLecturerDecorator());
        adjLec.Modifysyllabus();
        adjLec.CreateSyllabus();
        
    }

}