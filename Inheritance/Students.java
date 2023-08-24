class music_council
{
void sing()
{
System.out.print("\n music and singing\n");
}
}

class sports_council extends music_council
{
void play()
{
System.out.print("\n score of football is 2-nil\n");
}
}

class Students
{
public static void main(String args[])
{
sports_council s = new sports_council();
s.sing();
s.play();
}
}