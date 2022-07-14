#include<stdio.h>
void main()
{
float km, m, f, in, cm;
printf(" enter distance of twocities in km");
scanf(" %f", &km);
m=km*1000;
cm=km*1000*100;
f=km*3280.84;
in=km*39370.8;
printf("the distance in meters:%f\n", m);
printf("the distance in feet:%f\n", f);
printf("the distance in inches:%f\n", in);
printf(" the distance in centimeter:%f\n", cm);
}