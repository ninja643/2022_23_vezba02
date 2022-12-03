package rs.ac.ni.pmf.oop2;

public class BinaryOperatorsDemo
{
	public static void main(String[] args)
	{
		int value = 1 << 31;
		System.out.println(value);
		System.out.println(Integer.toBinaryString(value));
		int i = 0;
		while (i < 32)
		{
			value = value >>> 1;
			System.out.println(value);
			System.out.println(Integer.toBinaryString(value));
			i++;
		}
	}
}
