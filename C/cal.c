#include<stdio.h>
void main()
{
float basic, gross, da, hra;
printf(" enter basic salary of ramesh");
scanf("%f, &basic");
da= basic*0.4;
hra= basic*0.2;
gross= basic+da+hra;
printf(" gross salary=%f", gross);
}