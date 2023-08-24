class Student
{
void record()
{
System.out.print("\n Number of students in ");
}
}

class music_council extends Student
{ int d = 20;
void sing()
{
System.out.print(" music and singing is "+d+"\n");
}
}

class sports_council extends Student
{
int g = 40;
void play()
{
System.out.print(" playing football and cricket is "+g+"\n");
}
}

class Herirachy
{

public static void main(String args[])
{
sports_council s = new sports_council();
s.record();
s.play();

music_council m = new music_council();
m.record();
m.sing();

}
}