public class AverageNumber implements Runnable
{
int n;
private int[] num;
double avg;
public AverageNumber(int[] num)
{
this.num = num;
}
public void run()
{

for(int i = 1; i < num.length-1; i++)
{
n = n+num[i];
avg = (double)n/i;
}
System.out.println("Average Number is : "+avg);
}
}
MaximumNumber.java

// File Name : MaximumNumber.java

public class MaximumNumber implements Runnable
{
private int[] number;
public MaximumNumber(int[] number)
{
this.number = number;
}
public void run()
{
int largest = number[0];
for(int i=1; i< number.length; i++)
{
if(number[i] > largest)
largest = number[i]; 
}
System.out.println("Largest Number is : " + largest);
}
}